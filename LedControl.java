/**
 * The class LedControl controls the LED connected to GPIO01 of the Raspberry Pi board.
 * This code turns the LED on and off in every one second
 *
 * @author Kwanwoo Lee
 * @version 1.0
 */
import com.pi4j.io.gpio.*;

public class LedControl
{
       public static void main(String[] args) throws InterruptedException {
           // create an instance of GpioController
           final GpioController gpio = GpioFactory.getInstance();
       
           // set the GPIO_01 as an OUTPUT pin and initialize it as a LOW value
           final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, PinState.LOW);
           System.out.println("Starting:");
           while(true) {
               Thread.sleep(1000);
               pin.high();          // write high value to the GPIO_01 pin
               Thread.sleep(1000);
               pin.low();           // write low value to the GPIO_01 pin
            }
        }    
}   
