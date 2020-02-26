package com.mycompany.app;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
    	private static final Logger LOGGER=LogManager.getLogger(App.class);
    	static Scanner s=new Scanner(System.in);
    	public static float calculateSimpleInterest()
    	{
    		LOGGER.info("Entered into calculateSimpleInterest() method of APP.JAVA class\n");
    		
    		LOGGER.info("Enter the values to calculate simple interest:");
    		LOGGER.info("What amount of money is loaned or borrowed?");
    		float si_principal_amount=s.nextFloat();
    		
    		LOGGER.info("What is the interest rate (in percent) attached to this money?");
    		float si_rate_of_interest=s.nextFloat();
    		
    		LOGGER.info("After how much time(in years) do you want to know what your interest will be?");
    		int si_time=s.nextInt();
    		
    		Simple_interest simple_interest_object=new Simple_interest();
    		float simple_interest=simple_interest_object.simple_interest_calculation(si_principal_amount,si_rate_of_interest,si_time);
    		
    		LOGGER.info("Exited from calculateSimpleInterest() method of APP.JAVA class\n");
    		
    		return simple_interest;
    	}
    	static int ci_time;
    	public static double calculateCompoundInterest()
    	{
    		LOGGER.info("Entered into calculateCompoundInterest() method of APP.JAVA class\n");
    		
    		LOGGER.info("Enter the values to calculate compound interest:");
    		LOGGER.info("What amount of money is loaned or borrowed?");
    		float ci_principal_amount=s.nextFloat();
    		
    		LOGGER.info("What is the interest rate (in percent) attached to this money?");
    		float ci_rate_of_interest=s.nextFloat();
    		
    		LOGGER.info("After how much time(in years) do you want to know what your interest will be?");
    		ci_time=s.nextInt();
    		
    		LOGGER.info("Enter the number of times that interest is compounded per unit time:");
    		int no_of_times_interest_compounded=s.nextInt();
    		
    		Compound_interest compound_interest_object=new Compound_interest();
    		double compound_interest=compound_interest_object.compound_interest_calculation(ci_principal_amount,ci_rate_of_interest,ci_time,no_of_times_interest_compounded);
    		
    		LOGGER.info("Exited from calculateCompoundInterest() method of APP.JAVA class\n");
    		
    		return compound_interest;
    	}
    	public static float calculateConstructionCost()
    	{
    		LOGGER.info("Entered into calculateConstructionCost() method of APP.JAVA class\n");
    		
    		LOGGER.info("Enter total area of the house:");
    		float total_area=s.nextFloat();
    		
    		LOGGER.info("Choose the standard of materials from the options given below:\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\nEnter your choice:");
    		int material_standard=s.nextInt();
    		
    		boolean automation=false;
    		if(material_standard==3)
    		{
    			LOGGER.info("Choose the automation of the house from the options given below:\n\"true\" if you want fully automated home\n\"false\" if you donot want fully automated home");
    			automation=s.nextBoolean();
    		}   	 
    		Construction_cost construction_cost_object=new Construction_cost();
    		float total_construction_cost=construction_cost_object.construction_cost_calculation(total_area,material_standard,automation);
    		
    		LOGGER.info("Exited from calculateConstructionCost() method of APP.JAVA class\n");
    		
    		return total_construction_cost;
        }
    	public static void main(String args[])
    	{
    		LOGGER.info("Entered into main() method\n");
        	
    	     // Calculating Simple Interest
    	    	float simpleInterest;
    	    	LOGGER.info("To calculate Simple Interest:\n");
    	    	simpleInterest=calculateSimpleInterest();
    	    	LOGGER.info("Simple interest is : "+simpleInterest);
    	    	
    	    //Calculating Compound Interest
    	    	double compoundInterest;
    	    	LOGGER.info("\nTo calculate Compound Interest:\n");
    	    	compoundInterest=calculateCompoundInterest();
    	    	LOGGER.info("\nCompound Interest after "+ci_time+" years is : "+compoundInterest+" (without principal amount)");
    	    	
    	    //Calculating total Construction cost of House
    	    	float constructionCost;
    	    	LOGGER.info("\nTo calculate House Construction Cost : \n");
    	    	constructionCost=calculateConstructionCost();
    	    	LOGGER.info("Total Construction Cost of House: Rs."+constructionCost+"/-");
    	    	
    	    	LOGGER.info("\nExited from main() method");
    	    	
    	}
    }