import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MapaComponent } from './mapa/mapa.component';

import { RouterModule, Routes } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ListaLugaresComponent } from './lista-lugares/lista-lugares.component';
import { PaginaTurismoComponent } from './pagina-turismo/pagina-turismo.component';
import { HomeComponent } from './home/home.component';

import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { FormsModule } from "@angular/forms";

import { 
  IgxAvatarModule,
  IgxIconModule,
  IgxListModule,
  IgxRippleModule,
  IgxSliderModule,
  IgxToastModule,
  IgxButtonModule, 
  IgxFilterModule,
  IgxInputGroupModule,
  IgxButtonGroupModule
 } from "igniteui-angular";

/*const routes: Routes = [

  {path: '', redirectTo: '/app', pathMatch: 'full'},
  {path: 'lugares', component: ListaLugaresComponent},

];*/

@NgModule({
  declarations: [
    AppComponent,
    MapaComponent,
    HeaderComponent,
    FooterComponent,
    ListaLugaresComponent,
    PaginaTurismoComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //RouterModule.forRoot(routes),
    HttpClientModule,
    IgxAvatarModule,
    IgxFilterModule,
    IgxToastModule,
    IgxIconModule,
    IgxListModule,
    IgxInputGroupModule,
    IgxButtonGroupModule,
    IgxRippleModule,
    IgxSliderModule,
    IgxButtonModule,
    BrowserAnimationsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
