package cs.ing.software.lab1;

public class Automovil extends Vehiculo {

    Automovil(double consumo, double capacidad, double cantidad){
        super(consumo,capacidad,cantidad);
    }

    @Override
    String imprimirViaje(double viajeKm) {

        if (viajeKm >= 0) {
            double consumoViaje = viajeKm * consumo;
            double remanenteFuel = cantidad - consumoViaje;

            if (remanenteFuel > 0) {
                this.cantidad = this.cantidad - consumoViaje;
                return "El Automovil viajo: " + viajeKm + " Km y aun tiene " + remanenteFuel + " litros de combustible.";
            } else {
                return "El Automovil necesita reabastecmiento de combustible.";
            }
        }else{
            return "Automovil: Debe colocar un valor positivo.";
        }
    }
    @Override
    String reabastecer(double litros){
        if(litros >=0) {


            double espacio = capacidad - cantidad;
            if (litros > espacio) {
                return "No de puede reabastecer el tanque del Automovil. Esta lleno.";
            } else {
                cantidad = cantidad + litros;
                return "El combustible del Automovil es: " + cantidad + " litros.";
            }
        }else{
            return "Automovil: Debe colocar un valor positivo.";
        }
    }
}
