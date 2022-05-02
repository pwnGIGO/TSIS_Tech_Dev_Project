import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-lista-lugares',
  templateUrl: './lista-lugares.component.html',
  styleUrls: ['./lista-lugares.component.css']
})
export class ListaLugaresComponent implements OnInit {

  constructor(private http: HttpClient) { }


  url: string = 'https://coviuam.uam.mx:5001/lugares';

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        console.log(datos)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

}
