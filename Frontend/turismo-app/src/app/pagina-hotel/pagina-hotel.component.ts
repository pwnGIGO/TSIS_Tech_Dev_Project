import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-pagina-hotel',
  templateUrl: './pagina-hotel.component.html',
  styleUrls: ['./pagina-hotel.component.css']
})
export class PaginaHotelComponent implements OnInit {

  url: string = 'https://coviuam.uam.mx:5001/hoteles/';
  //url: string = 'http://localhost:5001/lugares/';
  hotel = {
    "nombre": "",
    "foto": "",
    "descripcion": "",
    "tipo": "",
    "horarios": "",
    "precio": ""
  }

  hotelId: string

  constructor(private http: HttpClient, private route: Router, private activatedRoute: ActivatedRoute ) { 
    this.hotelId = this.activatedRoute.snapshot.params['id'];
  }

  ngOnInit(): void {
    this.http.get<any>(this.url+this.hotelId).subscribe(
      datos => {
        this.hotel = datos["project"]
        //console.log(datos)
        //console.log(this.comentarios)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    //console.log("abriendo", id)
    this.route.navigate(['/mapa/' + id]);
  }

}
