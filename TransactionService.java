package com.problem1.service;

public class TransactionService {

	public int getNumberOfTransactions(int[] array, int valueTarget) {
		// TODO Auto-generated method stub
		
		int cumulativeSum = array[0];
		int i;
		for(i=1;i<array.length;i++)
		{
			if(cumulativeSum>=valueTarget)
			{
				break;
			}
			cumulativeSum += array[i];
		}
		
		return i;
	}
	
	

}
