package com.evil.inc.edio;

class NestedLoop {
	public static void main(String[] args) {
		int n = 10; // O(time complexity of the called function)
		int sum = 0; //O(1)
		double pie = 3.14; //O(1)
		int var = 1;

	
		while(var < n) {  // O(log n)
			System.out.println("Pie: " + pie); // O(log n)
			
			for (int j = 0; j < var; j++) {  // 2n
				sum++;  //  (2n-1)
			}
			var *= 2; // O(log n)
		} //end of while loop
		
		System.out.println("Sum: " + sum); //O(1)
	} //end of main
} //end of class
