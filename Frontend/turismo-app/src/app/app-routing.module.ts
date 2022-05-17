import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MapaComponent } from './mapa/mapa.component';
import { PaginaTurismoComponent } from './pagina-turismo/pagina-turismo.component';
import { ListaLugaresComponent } from './lista-lugares/lista-lugares.component';
import { ListaHotelesComponent } from './lista-hoteles/lista-hoteles.component';
import { PaginaHotelComponent } from './pagina-hotel/pagina-hotel.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'lugares',
    component: ListaLugaresComponent
  },
  {
    path: 'hoteles',
    component: ListaHotelesComponent
  },
  {
    path: 'lugares/:id',
    component: PaginaTurismoComponent
  },
  {
    path: 'hotel/:id',
    component: PaginaHotelComponent
  },
  {
    path: 'mapa/:id',
    component:MapaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
