package com.bridgelabz;

public class PrintArray<T> {
	
	private T[] inputArray;
	
	public PrintArray(T[] inputArray) {
		this.inputArray = inputArray;
	}
	
	public void toPrint() {
		PrintArray.toPrint(this.inputArray);
	}
	
	public static <E> void toPrint(E[] inputArray) {
	
		for(E element : inputArray) {
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'A','S','D','F','G'};
		
		new PrintArray(intArray).toPrint();
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
		

	}

}
