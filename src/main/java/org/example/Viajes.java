package org.example;
public class Viajes extends Avion{
    @Override
    public String diaVuelo(){
        return "Se suspende por mal clima ";
    }
    @Override
    public String destinoVulo(){
        return "Cambia por fallas en el avion";
    }
}