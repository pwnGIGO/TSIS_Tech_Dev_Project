import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { IgxListComponent, IgxToastComponent } from 'igniteui-angular';

@Component({
  selector: 'app-lista-hoteles',
  templateUrl: './lista-hoteles.component.html',
  styleUrls: ['./lista-hoteles.component.css']
})
export class ListaHotelesComponent implements OnInit {

  @ViewChild('toast', { static: true })
  public toast: IgxToastComponent;

  @ViewChild('mainIgxList', { static: true })
  public list: IgxListComponent;


  url: string = 'https://coviuam.uam.mx:5001/hoteles';
  hoteles = [];

  constructor(private http: HttpClient, private route: Router) {}


  ngOnInit(): void {
    this.http.get<any>(this.url).subscribe(
      datos => {
        console.log(datos)
        this.hoteles = datos["projects"]
      }, error => console.log("Ocurrió un error en la petición HTTP!")    
    );
  }

  public abrir(id) {
    this.route.navigate(['/hoteles/' + id]);
  }

}
