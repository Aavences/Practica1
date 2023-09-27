package org.example;

public class Avion {
    private String modelo = "Pilatus PC-12";
    private String marca="Airbus";
    private int pasajeros=10;
    private int puertas=2;
    private int motores= 2;

    public String diaVuelo(){
        return "18 de octubre 2023";
    }

    public String horaSalida(){
        return "10:00 am";
    }

    public String horaLlegada(){
        return "1:00 pm";
    }

    public String salidaVuelo(){
        return "Aereopuerto Internacional Benito juarez";
    }

    public String destinoVulo(){

        return "Dallas";
    }

}

