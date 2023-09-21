/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculosueldo;

/**
 *
 * @author uestudiantes
 */
public class Empleado {
//-----------------------Atributos de la clase empleado-------------------------
    public String nombres;
    public String apellidos;
    public String documento;
    public double sueldoBase;
    public double horasTrabajadas;
    public int edad; 
//------------------------------Constructores-----------------------------------
    public Empleado(/*SE PUEDEN RECIBIR PARAMENTOS*/){
        this.nombres="";
        this.apellidos="";
        this.documento="";
        this.sueldoBase=0.0;
        this.edad=0;
        this.horasTrabajadas=0; 
    }

    public Empleado(String nombres, String apellidos, String documento, double sueldoBase, int edad, double horasTrabajadas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.sueldoBase = sueldoBase;
        this.edad=edad;
        this.horasTrabajadas=0; 
    }

    public Empleado(double sueldoBase, int edad) {
        this.sueldoBase = sueldoBase;
        this.edad=edad;
    }
    public double calcularSueldo(){
        double sueldoPagar=0;   //variablede ambito local, solo existe en este metodo
        if(this.edad>60){
            sueldoPagar=(this.sueldoBase*0.10*this.horasTrabajadas)+this.sueldoBase;
            
        }else{
            sueldoPagar=(this.sueldoBase*this.horasTrabajadas);
        }
        return sueldoPagar;
    }

}
