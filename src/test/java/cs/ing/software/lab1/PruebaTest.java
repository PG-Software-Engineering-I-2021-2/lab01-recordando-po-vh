package cs.ing.software.lab1;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.logging.Logger;


public class PruebaTest {
    static final Logger logger = Logger.getLogger(Prueba.class.getName());

    //@Test(invocationCount = 80,threadPoolSize = 80)
    @Test
    public void TestCamion_ReabastecerZero(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.reabastecer(0));
        Assert.assertEquals(Mercedes.reabastecer(0),"El combustible del Camion es: 30.0 litros.");
    }
    @Test
    public void TestCamion_ReabastecerNeg(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.reabastecer(-1));
        Assert.assertEquals(Mercedes.reabastecer(-1),"Camion: Debe colocar un valor positivo.");
    }
    @Test
    public void TestCamion_ReabastecerOk(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.reabastecer(20));
        Assert.assertEquals(Mercedes.reabastecer(20),"El combustible del Camion es: 49.0 litros.");
    }
    @Test
    public void TestCamion_ReabastecerFull(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.reabastecer(100));
        Assert.assertEquals(Mercedes.reabastecer(100),"No de puede reabastecer el tanque del Camion. Esta lleno.");
    }

    @Test
    public void TestCamion_ManejarZero(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.imprimirViaje(0));
        Assert.assertEquals(Mercedes.imprimirViaje(0),"El Camion viajo: 0.0 Km y aun tiene 30.00 litros de combustible.");
    }
    @Test
    public void TestCamion_ManejarNeg(){
        Camion Mercedes = new Camion(1.6,100,30);
        //logger.info(Mercedes.imprimirViaje(-1));
        Assert.assertEquals(Mercedes.imprimirViaje(-1),"Camion: Debe colocar un valor positivo.");
    }
    @Test
    public void TestCamion_ManejarOK(){
        Camion Mercedes = new Camion(1.6,100,50);
        //logger.info(Mercedes.imprimirViaje(20));
        Assert.assertEquals(Mercedes.imprimirViaje(20),"El Camion viajo: 20.0 Km y aun tiene 18.00 litros de combustible.");
    }
    @Test
    public void TestCamion_ManejarReabastecer(){
        Camion Mercedes = new Camion(1.6,100,50);
        //logger.info(Mercedes.imprimirViaje(50));
        Assert.assertEquals(Mercedes.imprimirViaje(50),"El Camion necesita reabastecmiento de combustible.");
    }

    @Test
    public void TestAuto_ReabastecerZero(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.reabastecer(0));
        Assert.assertEquals(Ferrari.reabastecer(0),"El combustible del Automovil es: 40.0 litros.");
    }
    @Test
    public void TestAuto_ReabastecerNeg(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.reabastecer(-1));
        Assert.assertEquals(Ferrari.reabastecer(-1),"Automovil: Debe colocar un valor positivo.");
    }
    @Test
    public void TestAuto_ReabastecerOK(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.reabastecer(20));
        Assert.assertEquals(Ferrari.reabastecer(20),"El combustible del Automovil es: 60.0 litros.");
    }
    @Test
    public void TestAuto_ReabastecerFull(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.reabastecer(100));
        Assert.assertEquals(Ferrari.reabastecer(100),"No de puede reabastecer el tanque del Automovil. Esta lleno.");
    }
    @Test
    public void TestAuto_ManejarZero(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.imprimirViaje(0));
        Assert.assertEquals(Ferrari.imprimirViaje(0),"El Automovil viajo: 0.0 Km y aun tiene 40.0 litros de combustible.");
    }
    @Test
    public void TestAuto_ManejarNeg(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.imprimirViaje(-1));
        Assert.assertEquals(Ferrari.imprimirViaje(-1),"Automovil: Debe colocar un valor positivo.");
    }
    @Test
    public void TestAuto_ManejarOK(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.imprimirViaje(20));
        Assert.assertEquals(Ferrari.imprimirViaje(20),"El Automovil viajo: 20.0 Km y aun tiene 22.0 litros de combustible.");
    }
    @Test
    public void TestAuto_ManejarReabastecer(){
        Automovil Ferrari = new Automovil(0.9,100,40);
        //logger.info(Ferrari.imprimirViaje(50));
        Assert.assertEquals(Ferrari.imprimirViaje(50),"El Automovil necesita reabastecmiento de combustible.");
    }

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void TestCamion_Reabastecer80(){
        Camion Mercedes = new Camion(1.6,100,00);
        //logger.info(Mercedes.reabastecer(40));
        Assert.assertEquals(Mercedes.reabastecer(40),"El combustible del Camion es: 38.0 litros.");
    }

}
