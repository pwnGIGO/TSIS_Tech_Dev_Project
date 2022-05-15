import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subscriber } from 'rxjs';
import {Router, ActivatedRoute } from '@angular/router';

import * as L from 'leaflet'; 

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css']
})
export class MapaComponent implements OnInit {

  map: any;
  lugar = {
    "nombre": "",
    "foto": "",
    "descripcion": "",
    "tipo": "",
    "horarios": "",
    "precios": "",
    "latitud": "",
    "longitud": ""
  }
  lugarId: string
  url: string = 'https://coviuam.uam.mx:5001/lugares/';
  //url: string = 'http://localhost:5001/lugares/';

  constructor(private http: HttpClient, private route: Router, private activatedRoute: ActivatedRoute ) { 
    this.lugarId = this.activatedRoute.snapshot.params['id'];
    //console.log(this.lugarId)
    this.http.get<any>(this.url+this.lugarId).subscribe(
      datos => {
        //console.log(datos)
        this.lugar = datos["project"]
        this.loadMap();
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  ngOnInit(){}

  private loadMap(): void {
    
    let lat = Number(this.lugar.latitud)
    let long = Number(this.lugar.longitud)

    this.map = L.map('map', {
       center: [lat, long], // Ubicacion actual
       zoom: 50,
       layers: [L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png")],
       zoomControl: true
     });

    this.map.flyTo([lat, long], 15);

    const marker = L.marker([lat, long]).bindPopup(this.lugar.nombre);

    marker.addTo(this.map);
  }
}
