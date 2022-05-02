import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MapaComponent } from './mapa/mapa.component';
import { PaginaTurismoComponent } from './pagina-turismo/pagina-turismo.component';

const routes: Routes = [
  {
    path: 'listaLugares/:id',
    component: PaginaTurismoComponent
  },
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'mapa',
    component:MapaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
