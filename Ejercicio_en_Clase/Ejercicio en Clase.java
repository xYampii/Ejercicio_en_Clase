package ejercicio;

public class alumno extends universidad {
    public string curso;
    public string carrera;
    public string carnet;
}

public alumno(){
    this.curso="";
    this.carrera="";
    this.carnet="";
}

public alumno(String c, String ca, Int car){
    this.curso=c;
    this.carrera=ca;
    this.carnet=car;
}

private String getcurso(){
    return curso;
}     

private String setcurso(String c){
    this.curso=c;
} 

private String getcarrera(){
    return carrera;
}     

private String setcarrera(String ca){
    this.carrera=ca;
} 

private String getcarnet(){
    return carnet;
}     

private String setcarnet(String car){
    this.carnet=car;
} 

public void ensenar(){
    System.out.println("El Alumno del curso:" + this.curso + "esta en la carrera:" + this.carrera + "con el carnet numero:" + this.carnet);
}  

