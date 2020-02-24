package maven.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class App extends HouseConstruction
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String StandardMaterial="",AutomatedHouse="";
    	int AreaOfHouse=0;
    	Scanner sc=new Scanner(System.in);
    	LOGGER.debug("Enter the material standard");
        StandardMaterial=sc.nextLine();
        LOGGER.debug("Enter total area of house");
        AreaOfHouse=sc.nextInt();
        if(StandardMaterial.equalsIgnoreCase("high standard"))
        {
        	LOGGER.debug("Whether you want a fully automated house or not");
        	AutomatedHouse=sc.next();
        }
        else
        	AutomatedHouse="no";
        sc.close();
        HouseConstruction obj=new HouseConstruction(StandardMaterial,AreaOfHouse,AutomatedHouse);
        double TotalConstructionCost=obj.ConstructionCost();
        LOGGER.debug("Total construction cost is "+TotalConstructionCost);
    }
}
