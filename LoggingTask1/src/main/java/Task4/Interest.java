package Task4;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest
{
	private static final Logger LOGGER=LogManager.getLogger(Interest.class);
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter 0 if you want to calculate Simple Interest and 1 if you want to calculate Compound Interest");
		int choice=sc.nextInt();
		float principle=0,time=0,rateOfInterest=0,n=0;
		if(choice==0 || choice==1)
		{
			LOGGER.info("Enter Principle");
			 principle=sc.nextFloat();
			 LOGGER.info("Enter Time in years");
			 time=sc.nextFloat();
			 LOGGER.info("Enter Rate Of Interest");
			 rateOfInterest=sc.nextFloat();
			
		}
		switch(choice)
		{
		case 0:SimpleInterest simpleInterestObject=new SimpleInterest();
			float simpleInterestResult=simpleInterestObject.simpleInterestCalculator(principle,time,rateOfInterest);
			LOGGER.info("Result of simple interest is : "+simpleInterestResult);
			break;
		case 1:
			CompoundInterest compoundInterestObject=new CompoundInterest();
			double compoundInterestResult=compoundInterestObject.compoundInterestCalculator(principle,time,rateOfInterest);
			LOGGER.info("Result of compound interest is : "+compoundInterestResult);
			break;
		default:
			LOGGER.info("wrong option");
			break;
		}
		
		
	}
}