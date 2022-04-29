import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PaginaTurismoComponent } from './pagina-turismo/pagina-turismo.component';

const routes: Routes = [
  {
    path: 'lugares/:id',
    component: PaginaTurismoComponent
  },
  {
    path: '',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
