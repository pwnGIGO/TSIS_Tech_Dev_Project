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


  //url: string = 'https://coviuam.uam.mx:5001/lugares';
  url: string = 'http://localhost:8080/v1/lugares';
  lugares = [];
  arrTemporal = [];
  //isFavorite: false,
  //photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/27.jpg'

  filtrado = {
    "Museo": false,
    "Monumento": false,
    "Zona Arqueológica": false,
    "Playa": false,
    "Pueblo Mágico": false,
  }

  min = 0
  max = 0
  minValue;
  maxValue;
  aux:boolean;

  constructor(private http: HttpClient, private route: Router) {}

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        this.lugares = datos;
        this.arrTemporal = datos;
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    console.log('IDD',id);
    this.route.navigate(['/lugares/' + id]);
  }
  
  public limpiar(){
    for(let tipo in this.filtrado){
      this.filtrado[tipo] = false;
    }
    this.minValue = undefined;
    this.maxValue = undefined;
    this.max = 0;
    this.min = 0;
    this.aux = false;
    this.lugares = [];
    this.lugares = this.arrTemporal;
  }

  funcionMin($event){
    this.min = $event.target.value;
    console.log(this.min);
  }

  funcionMax($event){
    this.max = $event.target.value;
    console.log(this.max.toString().length);
  }


  public filtro(tipo){
    this.filtrado[tipo] = !this.filtrado[tipo]
    console.log(this.filtrado)
  }

  public buscar(){
    let listaIds = []

    for(let tipo in this.filtrado){
      if(this.filtrado[tipo]){
        for(let lugar in this.lugares){
          if(this.lugares[lugar]["tipo"].indexOf(tipo) != -1){
            listaIds.push(this.lugares[lugar]["nombre"])
          }
        }
      }
    }
    let unique = [...new Set(listaIds)]

    let newArray = this.lugares.filter((item) => unique.indexOf(item.nombre) != -1);

    
    for(let tipo in this.filtrado){
      if(this.filtrado[tipo]){
        this.aux = this.filtrado[tipo];
        break;
      }
    }

    if(this.aux){
      //Alguno de los checkbox esta seleccionado, pero no se introdujo precio min. ni precio max.
      if((this.max.toString().length === 0 && this.min.toString().length === 0) || (this.max === 0 && this.min === 0)){
        this.lugares = [];
        this.lugares = newArray
      }

      //Alguno de los checkbox esta seleccionado, pero no se introdujo precio max. pero si precio min.
      else if((this.max.toString().length === 0 || this.max === 0) && (this.min.toString().length != 0 || this.min != 0)){
        this.lugares = [];
        for(let i = 0; i < newArray.length; i++){
          if(newArray[i].precio >= this.min){
            this.lugares.push(newArray[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }
      //Alguno de los checkbox esta seleccionado, pero no se introdujo precio min. pero si precio max.
      else if((this.min.toString().length === 0 || this.min === 0) && (this.max.toString().length != 0 || this.max != 0)){
        this.lugares = [];
        for(let i = 0; i < newArray.length; i++){
          if(newArray[i].precio <= this.max){
            this.lugares.push(newArray[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }
      //Alguno de los checkbox esta seleccionado, y además se introdujo precio max. y precio min. también
      else if((this.max.toString().length != 0 && this.min.toString().length != 0) || (this.max != 0 && this.min != 0)){
        this.lugares = [];
        for(let i = 0; i < newArray.length; i++){
          if(newArray[i].precio <= this.max && newArray[i].precio >= this.min){
            this.lugares.push(newArray[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }
    }else{
      //Ninguno de los checkbox esta seleccionado, y tampoco se introdujo precio min. ni precio max.
      if((this.max.toString().length === 0 && this.min.toString().length === 0) || (this.max === 0 && this.min === 0)){
        this.limpiar();
        alert('No se pudo hace la busqueda por que no se seleccinó ningún filtro')
      }

      //Ninguno de los checkbox esta seleccionado, y no se introdujo precio max. pero si precio min.
      else if((this.max.toString().length === 0 || this.max === 0) && (this.min.toString().length != 0 || this.min != 0)){
        this.lugares = [];
        for(let i = 0; i < this.arrTemporal.length; i++){
          if(this.arrTemporal[i].precio >= this.min){
            this.lugares.push(this.arrTemporal[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }

      //Ninguno de los checkbox esta seleccionado, y no se introdujo precio min. pero si precio max.
      else if((this.min.toString().length === 0 || this.min === 0) && (this.max.toString().length != 0 || this.max != 0)){
        this.lugares = [];
        for(let i = 0; i < this.arrTemporal.length; i++){
          if(this.arrTemporal[i].precio <= this.max){
            this.lugares.push(this.arrTemporal[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }

      //Ninguno de los checkbox esta seleccionado, pero si se introdujo precio max. y precio min. también
      else if((this.max.toString().length != 0 && this.min.toString().length != 0) || (this.max != 0 && this.min != 0)){
        this.lugares = [];
        for(let i = 0; i < this.arrTemporal.length; i++){
          if(this.arrTemporal[i].precio <= this.max && this.arrTemporal[i].precio >= this.min){
            this.lugares.push(this.arrTemporal[i]);
          }
        }
        if(this.lugares.length === 0){
          this.limpiar();
          alert('No se encontró ningun lugar con los filtros seleccionados')
        }
      }
    }
  }
}
