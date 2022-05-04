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
  lugares = [];
  //isFavorite: false,
  //photo: 'https://www.infragistics.com/angular-demos-lob/assets/images/men/27.jpg'

  constructor(private http: HttpClient, private route: Router) {}

  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        console.log(datos)
        this.lugares = datos["projects"]
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    //console.log("abriendo", id)
    this.route.navigate(['/lugares/' + id]);
  }

  public toggleFavorite(contact: any) {
    contact.isFavorite = !contact.isFavorite;
  }

}
