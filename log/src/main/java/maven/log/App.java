package maven.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
        Scanner sc=new Scanner(System.in);
        LOGGER.debug("Enter the principle");
        int principle=sc.nextInt();
        LOGGER.debug("Enter the number of years");
        int time=sc.nextInt();
        LOGGER.debug("Enter the rate of interest per annunm");
        double rate=sc.nextDouble();
        sc.close();
        double SimpleInterest=principle*time*rate/100;
        double CompoundInterest=principle*Math.pow((1+(rate/100)),time);
        LOGGER.debug("The Simple Interest is: "+SimpleInterest);
        LOGGER.debug("The Compound Interest is: "+CompoundInterest);
    }
}
