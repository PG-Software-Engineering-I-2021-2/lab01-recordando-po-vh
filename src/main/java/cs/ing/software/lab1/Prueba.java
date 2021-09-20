package cs.ing.software.lab1;
import java.util.logging.Logger;

public class Prueba {

    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    public static void main(String[] args)
    {
        Automovil auto1 = new Automovil(0.9,100,10);
        String auto1Viaje = auto1.imprimirViaje(4);
        logger.info(auto1Viaje);
    }
}
