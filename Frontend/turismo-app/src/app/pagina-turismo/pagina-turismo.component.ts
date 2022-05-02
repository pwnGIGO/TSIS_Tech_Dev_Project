import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pagina-turismo',
  templateUrl: './pagina-turismo.component.html',
  styleUrls: ['./pagina-turismo.component.css']
})
export class PaginaTurismoComponent implements OnInit {
  nombre: string = ""
  foto: string =""
  tipo: string = ""
  descripcion: string =""
  precios: string =""
  horarios: string=""

  constructor() { 
    this.nombre= "Píramide Kukulcan"
    this.foto = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Chichen_Itza_3.jpg/1200px-Chichen_Itza_3.jpg"
    this.tipo = "Zona arqueologica"
    this.descripcion= "El templo de Kukulkán (también conocido con el nombre de «El Castillo»),1​ es un edificio prehispánico ubicado en la península de Yucatán, en el actual estado del mismo nombre. El actual templo se construyó en el siglo xii d. C. por los mayas itzaes en su capital, la ciudad de Chichén Itzá, fundada originalmente en el siglo vi d. C.2​ Su diseño tiene una forma geométrica piramidal; cuenta con nueve niveles o basamentos, cuatro fachadas principales, cada una con una escalinata central, y una plataforma superior, rematada por un templete. En esta construcción, se rindió culto a la entidad maya Kukulkán (en idioma maya: serpiente emplumada),3​ razón por la cual se pueden apreciar motivos serpentinos en la decoración arquitectónica. Por otra parte, también cuenta con simbolismos que hacen alusión a los números más importantes utilizados en el calendario solar agrícola, el calendario Tzolkin (calendario sagrado) y la rueda calendárica. La alineación de la construcción de la pirámide permite que se puedan observar diversos fenómenos de luz y sombra, los cuales se producen en su propio cuerpo durante los equinoccios y solsticios cada año."
    this.precios="Adultos : $200 Niños: $50 Tercera edad: $100"
    this.horarios="LUNES A VIERNES DE 9:00 a 18:00 SABADO Y DOMINGOS 9:00 a 14:00"
  }

  ngOnInit(): void {
  }

}
