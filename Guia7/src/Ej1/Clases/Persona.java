package Ej1.Clases;

public class Persona {
    private  String nombre;
    private int edad;
    private int dni;
    private String sexo;


    public Persona(String nombre, int edad, int dni, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void pasarObjetoAJson( Persona p){
        System.out.println("["+"/n"+"{"+"/n" +"nombre"+":" + p.nombre +","+"/n"+ "edad"+":"+ p.edad+"}"+"]");

    }
}
