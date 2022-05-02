import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MapaComponent } from './mapa/mapa.component';
import { PaginaTurismoComponent } from './pagina-turismo/pagina-turismo.component';
import { ListaLugaresComponent } from './lista-lugares/lista-lugares.component';

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
    path: 'lugares/:id',
    component: PaginaTurismoComponent
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
