package com.bayviewglen.project;

public class theactualthing extends java.lang.Object
{
	//jIA
	//jIA
	//jIA
	//jIA
	//jIA
	int number;
	double sum;
	double max;
	double min;



	public void Statistician(){
		number = 0;
	}

	public void addAll(Statistician addend)
	{
		if (number == 0) //the number in the original statistican is 0...so the new number is the new array's number
		{
			number = addend.count;
			sum = addend.sum;
			max = addend.max;
			min = addend.min;
		}
		else
			number += addend.count;
			sum += addend.sum;
			if (addend.max > max)
				max = addend.max;
			if (addend.min < min)
				min = addend.min;
		}
	


	public void clear()
	{
		number = 0;
	}

	public int length()
	{
		return number;
	}
	
	public double maximum()
	{
		if (number == 0)
			return 0;
		return max;
	}

	public double mean()
	{
		if (number == 0)
			return 0;
		return sum / number;
	}

	public double minimum()
	{
		if (number == 0)
			return 0;
		return min;
	}


	public void next(double Number){
		if(number == 0 ){
			max = Number; 
			min = Number;
			number = 1; 
			sum = Number; 
		}
		else
		{
			sum += Number;
			if (number > max)
				max = Number;
			if (number < min)
				min = Number;
			number += number + 1;
		}
		}
	public double sum()
	{
		if (number == 0)
			return 0;
		return sum;
	}


}



