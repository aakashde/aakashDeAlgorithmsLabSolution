package com.problem2.driver;

import java.util.Scanner;

import com.problem2.service.DenominationDetails;
import com.problem2.service.MergeSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, size-1);
		
				
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		DenominationDetails denominationdetails = new DenominationDetails(); //service class to implement logic
		
				denominationdetails.getDenominationDetails(array,amount);
		
		
		sc.close();
		

	}

}
