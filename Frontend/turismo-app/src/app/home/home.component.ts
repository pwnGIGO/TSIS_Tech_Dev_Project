import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  url: string = 'https://coviuam.uam.mx:5001/lugares';
  imagen = {"foto":""}
  imagenes

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        this.imagen = datos["projects"].pop() // Primera imagen para mostrar 
        this.imagenes = datos["projects"] // Resto de imagenes
        //console.log(this.imagen)
        //console.log(this.imagenes)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }
}
