import { Component, OnInit } from '@angular/core';

import { Observable, Subscriber } from 'rxjs';
import * as L from 'leaflet'; 

@Component({
  selector: 'app-mapa',
  templateUrl: './mapa.component.html',
  styleUrls: ['./mapa.component.css']
})
export class MapaComponent implements OnInit {

  constructor() { }

  map: any;

  ngOnInit(){   
    this.loadMap();
  }

  private loadMap(): void {
    // Coordenadas de la UAM-I
    let lat = 19.3623615
    let long = -99.073

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
