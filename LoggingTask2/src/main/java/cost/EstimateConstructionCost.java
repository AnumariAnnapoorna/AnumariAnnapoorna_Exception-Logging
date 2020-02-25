package cost;

public class EstimateConstructionCost {
	double calculateCost(int choice,float area)
	{
		double result=0;
		if(choice==1)
		{
			result=1200*area;
		}
		else if(choice==2)
		{
			result=1500*area;
		}
		else if(choice==3)
		{
			result=1800*area;
		}
		else if(choice==4)
		{
			result=2500*area;
		}
		return result;
	}


}
