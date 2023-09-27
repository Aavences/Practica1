package org.example;

public class Main {
    public static void main(String[] args) {
        Avion aereolinea = new Avion();
        Viajes terminal = new Viajes();


        System.out .println("Dia del vuelo "+aereolinea.diaVuelo());
        System.out .println("Hora de salida "+aereolinea.horaSalida());
        System.out .println("Hora de llegada "+aereolinea.horaLlegada());
        System.out .println("Aereopuerto de salida "+aereolinea.salidaVuelo());
        System.out .println("Destino "+aereolinea.destinoVulo());

        System.out.println(terminal.diaVuelo());
        System.out.println(terminal.destinoVulo());
    }
}