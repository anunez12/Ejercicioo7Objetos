/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author SP
 */
public class Hora { 
  private int Horas;private int minutos;private int segundos; 

    public Hora() {
        this.Horas =00; 
        this.minutos=00; 
        this.segundos=00;
    } 

    public Hora(int Horas, int minutos, int segundos) {
        this.Horas = Horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {      
        this.segundos = segundos;
    }
    public String MayorHora(Hora h2){
        String hora;
        
        if(this.Horas>h2.Horas && this.minutos>h2.minutos && this.segundos>h2.segundos){
            hora="La hora ingresada es mayor que la comparada";
        }else{
            hora="La hora ingresada no es mayor que la comparada";
        }
        return hora;
    } 
      public String MenorHora(Hora h2){
        String hora;
        
        if(this.Horas<h2.Horas &&this.minutos<h2.minutos && this.segundos<h2.segundos){
            hora="La hora ingresada es menor que la comparada";
        }else{
            hora="La hora ingresada no es menor que la comparada";
        }
        return hora;
      } 
      public String IgualHora(Hora h2){
        String hora;
        
        if(this.Horas==h2.Horas && this.minutos==h2.minutos && this.segundos==h2.segundos){
            hora="La hora ingresada es igual a la comparada";
        }else{
            hora="La hora ingresada no es igual a la comparada ";
        }
        return hora; 
      } 
      public String Validar(){
        String hora;
        
        if(this.getHoras()<=23 &&this.getMinutos()<=59 &&this.getSegundos()<=59){
            hora="La hora a ingresar es valida";
        }else{
            hora="La hora a ingresar no es valida";
        }
        return hora; 
      } 
       public String MostrarDatosZonaHoraria(Hora h2){
        String hora;
                
        hora = "Hora 1:"+"\n" +"Las horas son: "+this.Horas+ "\n"+ "Los minutos son: "+this.minutos+ "\n"
                + "Los segundo son: "+this.segundos+"\n\n"+ "Hora 2:"+"\n"
                + "Las Horas son: "+h2.Horas+"\n"+ "Los minutos son: "+h2.minutos+"\n" + "Los Segundos son: "+h2.segundos+"\n";
            return hora;    
       }      
}         
                

      
 
    

