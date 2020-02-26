package com.mycompany.app;
public class Compound_interest 
{
	public double compound_interest_calculation(float principal_amount, float rate_of_interest, int time, int no_of_times_interest_compounded)
	{
	double total_compound_interest= (principal_amount*Math.pow(1 + (rate_of_interest/no_of_times_interest_compounded),(no_of_times_interest_compounded*time)));
	return total_compound_interest-principal_amount;
	}
}	
