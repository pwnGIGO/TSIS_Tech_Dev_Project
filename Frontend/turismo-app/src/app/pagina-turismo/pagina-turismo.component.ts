import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-pagina-turismo',
  templateUrl: './pagina-turismo.component.html',
  styleUrls: ['./pagina-turismo.component.css']
})
export class PaginaTurismoComponent implements OnInit {
  
  url: string = 'https://coviuam.uam.mx:5001/lugares/';
  lugar = {
    "nombre": "",
    "foto": "",
    "descripcion": "",
    "tipo": "",
    "horarios": "",
    "precios": ""
  }
  comentarios

  lugarId: string

  constructor(private http: HttpClient, private route: Router, private activatedRoute: ActivatedRoute ) { 
    this.lugarId = this.activatedRoute.snapshot.params['id'];
    //console.log(this.lugarId)
  }

  ngOnInit(): void {
    this.http.get<any>(this.url+this.lugarId).subscribe(
      datos => {
        this.lugar = datos["project"]
        this.comentarios = datos["project"]["comentarios"]
        //console.log(datos)
        //console.log(this.comentarios)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    //console.log("abriendo", id)
    this.route.navigate(['/mapa/' + id]);
  }

  public abrirHoteles() {
    //console.log("abriendo")
    this.route.navigate(['/hoteles']);
  }

}

