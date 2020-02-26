package com.mycompany.app;
public class Construction_cost {
	  float total_construction_cost;
	  public float construction_cost_calculation(float total_area,int material_standard,boolean automation)
	  {
	    if(material_standard==1)
	    {
	      total_construction_cost=total_area*1200;
	      return total_construction_cost;
	    }
	    else if(material_standard==2)
	    {
	      total_construction_cost=total_area*1500;
	      return total_construction_cost;
	    }
	    else if(material_standard==3)
	    {
	      if(automation==true)
	      {
	        total_construction_cost=total_area*2500;
	        return total_construction_cost;
	      }
	      else
	      {
	        total_construction_cost=total_area*1800;
	        return total_construction_cost;
	      }
	    }
	    return 0;
	  }
	}
