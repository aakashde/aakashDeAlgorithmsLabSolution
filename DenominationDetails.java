package com.problem2.service;

public class DenominationDetails {

	public void getDenominationDetails(int[] array, int amount) {
		// TODO Auto-generated method stub
		
		int count = 0;
		boolean flag = true;
		int countDenomination[][] = new int[array.length][2];
		
		try {
			
		
			for(int i=array.length-1;i>=0;i--)
			{
				/*while(array[i]<=amount)
				{
					count++;
					amount=amount-array[i];
				
				
				}
				*/
				//if(count!=0)
				//System.out.println(array[i]+" : "+count);
				count = amount/array[i];
				amount -= count*array[i];
				//System.out.println(amount);
				//System.out.println(count);
				countDenomination[i][0] = array[i];
				countDenomination[i][1] = count;
			
				count=0;
			
			}
			if(amount!=0)
			flag = false;
		
			if(flag)
			{
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=array.length-1;i>=0;i--)
				{
					if(countDenomination[i][1]!=0)
						System.out.println(countDenomination[i][0] + " : "+countDenomination[i][1]);
				}
			}
			else
			{
				System.out.println("Exact amount cannot be given with the highest denominations");
			}
		}
		catch(Exception e)
		{
			System.out.println(e+" 0 is not a valid denomination. Please enter correct denomination value");
		}
		
	}

}
