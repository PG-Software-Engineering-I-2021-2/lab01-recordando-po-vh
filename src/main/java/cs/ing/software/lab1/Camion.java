package cs.ing.software.lab1;

public class Camion extends Vehiculo{

    Camion(double consumo, double capacidad, double cantidad){
        super(consumo,capacidad,cantidad);
    }
    @Override
    String imprimirViaje(double viajeKm) {


        if(viajeKm >= 0) {
            double consumoViaje = viajeKm * consumo;
            double remanenteFuel = cantidad - consumoViaje;

            if (remanenteFuel > 0) {
                cantidad = cantidad - consumoViaje;
                return "El Camion viajo: " + viajeKm + " Km y aun tiene " + String.format("%.2f", remanenteFuel) + " litros de combustible.";
            } else {
                return "El Camion necesita reabastecmiento de combustible.";
            }
        }else{
            return "Camion: Debe colocar un valor positivo.";
        }
    }

    @Override
    String reabastecer(double litrosC){
        if(litrosC >=0) {
            double espacio = capacidad - cantidad;
            if (litrosC > espacio) {
                return "No de puede reabastecer el tanque del Camion. Esta lleno.";
            } else {
                cantidad = cantidad + litrosC * 0.95;
                return "El combustible del Camion es: " + cantidad + " litros.";
            }
        }else{
            return "Camion: Debe colocar un valor positivo.";
        }
    }
}
