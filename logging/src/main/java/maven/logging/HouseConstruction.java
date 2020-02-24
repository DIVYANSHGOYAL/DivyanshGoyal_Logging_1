package maven.logging;

public class HouseConstruction {
	String Standard;
	int area;
	String AutomatedHouse;
	HouseConstruction()
	{
		Standard="";
		area=0;
		AutomatedHouse="";
	}
	HouseConstruction(String s,int a,String ah)
	{
		Standard=s;
		area=a;
		AutomatedHouse=ah;
	}
	double ConstructionCost()
	{
		int CostPerSquareFeet=0;
		if(Standard.equalsIgnoreCase("standard"))
			CostPerSquareFeet=1200;
		else if(Standard.equalsIgnoreCase("above standard"))
			CostPerSquareFeet=1500;
		else if(Standard.equalsIgnoreCase("high standard"))
		{
			if(AutomatedHouse.equalsIgnoreCase("yes"))
					CostPerSquareFeet=2500;
				else 
					CostPerSquareFeet=1800;
		}
		return (CostPerSquareFeet*area);
	}

}
