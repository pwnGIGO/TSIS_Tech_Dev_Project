import { Component, OnInit, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { IgxToastComponent, IgxListComponent } from 'igniteui-angular';
import {Router} from '@angular/router';


@Component({
  selector: 'app-lista-lugares',
  templateUrl: './lista-lugares.component.html',
  styleUrls: ['./lista-lugares.component.css']
})
export class ListaLugaresComponent implements OnInit {

  @ViewChild('toast', { static: true })
  public toast: IgxToastComponent;

  @ViewChild('mainIgxList', { static: true })
  public list: IgxListComponent;


  url: string = 'https://coviuam.uam.mx:5001/lugares';
  //url: string = 'http://localhost:5001/lugares';
  lugares = [];
  //isFavorite: false,
  //photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/27.jpg'

  filtradro = {
    "Museo": false,
    "Zona Arqueológica": false,
    "Playa": false,
    "Pueblo Mágico": false,
  }

  min = 0
  max = 0

  constructor(private http: HttpClient, private route: Router) {}

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        //console.log(datos)
        this.lugares = datos["projects"]
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    //console.log("abriendo", id)
    this.route.navigate(['/lugares/' + id]);
  }
  
  public limpiar(){
   this.http.get<any>(this.url).subscribe(
      datos => {
        //console.log(datos)
        this.lugares = datos["projects"]
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }


  public filtro(tipo){
    //console.log("entre", tipo)
    this.filtradro[tipo] = !this.filtradro[tipo]
    //console.log(this.filtradro)
  }

  public buscar(){
    var listaIds = []

    //console.log("Buscando")
    for(var tipo in this.filtradro){
      if(this.filtradro[tipo]){
        //console.log("Busca", tipo)
        for(var lugar in this.lugares){
          //console.log("Busca", this.lugares[lugar]["tipo"].indexOf(tipo))
          if(this.lugares[lugar]["tipo"].indexOf(tipo) != -1){
            //console.log("Contenido", this.lugares[lugar]["nombre"] ,this.lugares[lugar]["tipo"])
            listaIds.push(this.lugares[lugar]["nombre"])
          }
        }
      }
    }
    var unique = [...new Set(listaIds)]
    //console.log(unique)

    var newArray = this.lugares.filter((item) => unique.indexOf(item.nombre) != -1);
    this.lugares = newArray
    //console.log(newArray);
  }

}
