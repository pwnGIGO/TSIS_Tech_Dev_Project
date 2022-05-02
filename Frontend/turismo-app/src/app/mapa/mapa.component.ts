import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subscriber } from 'rxjs';
import * as L from 'leaflet'; 

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css']
})
export class MapaComponent implements OnInit {

  constructor(private http: HttpClient) { }

  map: any;

  lugar = 
  {
    "_id": "1",
    isFavorite: false,
    nombre: 'Chichén Itzá',
    estado: 'Yucatán',
    tipo: "Zona arqueológica",
    photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/27.jpg',
    latitud: "20.684395278089813",
    longitud: "-88.56746073197196"
  }

  ngOnInit(){   
    this.loadMap();
  }

  private loadMap(): void {
    // Coordenadas de la UAM-I
    let jeje = 12.113838
    console.log(typeof(jeje))
    let lat = Number(this.lugar.latitud)
    let long = Number(this.lugar.longitud)

    this.map = L.map('map', {
       center: [lat, long], // Ubicacion actual
       zoom: 14,
       layers: [L.tileLayer("https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png")],
       zoomControl: true
     });

    this.map.flyTo([lat, long], 13);
    const marker = L.marker([lat, long]).bindPopup('Angular Leaflet');
    marker.addTo(this.map);
  }
}
