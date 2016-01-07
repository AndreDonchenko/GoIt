package ua.goit.andre.lab5;

public class IntArraysTools {

	public static int minArrayValue(final int[] arr) {
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) minIndex = i; 
		}
		return arr[minIndex];
	}
	
	public static int maxArrayValue(final int[] arr) {
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) maxIndex = i; 
		}
		return arr[maxIndex];
	}

	public static int[] sortArray (final int[] arr, boolean ascending) {
		int[] sortedArray = arr.clone();
		int tempInt = 0;
		for (int i = 0; i < sortedArray.length-1; i++) {
			for (int j = i+1; j < sortedArray.length; j++) {
				if (((sortedArray[j] < sortedArray[i]) && (ascending)) || 
					((sortedArray[j] > sortedArray[i]) && (!ascending))) {
					tempInt = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tempInt;
				}
			}
		}
		return sortedArray;
	}
}
