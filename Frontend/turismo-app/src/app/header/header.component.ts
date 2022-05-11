import { Component } from '@angular/core';
import { Location } from '@angular/common';
import {Router} from '@angular/router';

@Component({
    selector: 'app-header',
    templateUrl: './header.component.html'
})
export class HeaderComponent {
    title:string = 'TonalliApp';
    
    muestraBoton = false

    constructor(private _location: Location, private router: Router){
        if(this.router.url == "/"){
            this.muestraBoton = false
        }else{
            this.muestraBoton = true
        }
    }

    goBack(){
        //console.log(typeof(this.router.url), this.router.url)

        if(this.router.url == "/"){
            console.log("Estas en la raiz")
        }else{
            //console.log("Regresanding")
            this._location.back();
        }
    }
}