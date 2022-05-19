import { Component, OnInit } from '@angular/core';
import {Router, ActivatedRoute } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

interface Comentario{
  descripcion: string;
  fecha: string;
  usuario: string;
}

@Component({
  selector: 'app-pagina-turismo',
  templateUrl: './pagina-turismo.component.html',
  styleUrls: ['./pagina-turismo.component.css']
})
export class PaginaTurismoComponent implements OnInit {
  
  //url: string = 'https://coviuam.uam.mx:5001/lugares/';
  url: string = 'http://localhost:8080/v1/lugares/';
  urlPost: string;

  headers={
    headers: new HttpHeaders({
        'Content-Type': 'application/json'
    })
}

  lugar = {
    "nombre": "",
    "foto": "",
    "descripcion": "",
    "tipo": "",
    "horarios": "",
    "precio": ""
  }
  comentarios
  descripcionLugar

  lugarId: string;

  constructor(private http: HttpClient, private route: Router, private activatedRoute: ActivatedRoute ) { 
    this.lugarId = this.activatedRoute.snapshot.params['id'];
    this.urlPost = `http://localhost:8080/v1/lugares/${this.lugarId}/comentarios`;
    //console.log(this.lugarId)
  }

  
  ngOnInit(): void {
    this.http.get<any>(this.url+this.lugarId).subscribe(
      datos => {
        this.lugar = datos
        this.comentarios = datos["comentarios"]
        //console.log(datos)
        //console.log(this.comentarios)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  guardaComentario($event){
    this.descripcionLugar = $event.target.value;
  }

  comentar(){ 
   
   let year = new Date().getFullYear()
   let month = new Date().getMonth()
   let day = new Date().getDate()

   let com: Comentario = {
    descripcion: this.descripcionLugar,
    fecha: `${day}/${month+1}/${year}`,
    usuario: `usuarioAnonimo`,
   }


   this.http.post<Comentario>(this.urlPost, JSON.stringify(com),this.headers).subscribe(
     respone => this.route.navigate['/lugares/' + this.lugarId]
   )

   location.reload();
   alert('Comentario agregado con exito')

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

