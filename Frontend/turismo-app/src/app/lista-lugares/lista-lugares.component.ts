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

  public contacts;


  url: string = 'https://coviuam.uam.mx:5001/lugares';


  constructor(private http: HttpClient, private route: Router) {}



  ngOnInit(): void {

    this.contacts = Object.assign([], this.lugares);


    this.http.get<any>(this.url).subscribe(
      datos => {
        console.log(datos)
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
      );
  }


  lugares = [
  {
    "_id": "1",
    isFavorite: false,
    nombre: 'Chichén Itzá',
    estado: 'Yucatán',
    tipo: "Zona arqueológica",
    photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/27.jpg'
  }, {
    "_id": "2",
    isFavorite: true,
    nombre: 'Templo Mayor',
    estado: 'CDMX',
    tipo: "Zona arqueológica",
    photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/1.jpg'
  }, {
    "_id": "3",
    isFavorite: false,
    nombre: 'Tajín',
    estado: 'Veracruz',
    tipo: "Zona arqueológica",
    photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/women/50.jpg'
  }
  ];


  public abrir(n) {
    console.log("abriendo", n)
    this.route.navigate(['/lugares/' + n]);
  }

  public toggleFavorite(contact: any) {
    contact.isFavorite = !contact.isFavorite;
  }

}
