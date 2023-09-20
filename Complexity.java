
public class Complexity {
	
	// Name: Feruz Karimov
	 
	
	
	public static void method1(int n) {
	// a method that has time complexity O(n2).
		int counter=0;
		
		//checking for negative values
		if (n < 0) {
			
			System.out.println("The value must be positive");
		}
		else {
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					
					System.out.println("Operation " + counter); 
					counter++;
				}
			}
			
			System.out.println("Total number of operations for time complexity O(n^2) is " + counter);
		}
	} 
	
	public static void method2(int n) {
	// a method that has time complexity O(n3).
		int counter=0;
		
		//checking for negative values
		if (n < 0) {
			System.out.println("The value must be positive");
			
		}
		else {
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						
						System.out.println("Operation " + counter); 
						counter++;
						
					}
				}
			}
			System.out.println("Total number of operations for time complexity O(n^3) is " + counter);
		}
	} 
	
	public static void method3(int n) {
	// a method that has time complexity O(logn).
		int counter=0;
		
		//checking for negative values
		if (n < 0) {
			System.out.println("The value must be positive");
			
		}
		else {
			
			for (int i = 1; i < n; i = i * 2) {
				
				System.out.println("Operation " + counter); 
				counter++;
			}
			System.out.println("Total number of operations for time complexity O(logn) is " + counter);
		}
	}
	
	
	public static void method4(int n) {
	// a method that has time complexity O(nlogn).
		int counter=0;
		
		//checking for negative values
		if (n < 0) {
			System.out.println("The value must be positive");
			
		}
		else {
			
			for (int i = 0; i < n; i ++) {
				for (int j = 1; j < n; j = j * 2) {
					
					System.out.println("Operation " + counter); 
					counter++;
				}
			}
			System.out.println("Total number of operations for time complexity O(nlogn) is " + counter);
		}	
	}
	
	public static void method5(int n) {
	// a method that has time complexity O(loglogn).
		
		int counter=0;
		
		//checking for negative values
		if (n < 0) {
			System.out.println("The value must be positive");
			
		}
		else {
			
			for (int i = 2; i < n; i = i * i) {
				
				System.out.println("Operation " + counter); 
				counter++;
			}
			System.out.println("Total number of operations for time complexity O(loglogn) is " + counter);
		}
	}
	
	
	static int count = 1;
	
	public static int method6(int n) {
	// a method that has time complexity O(2^n).
		
		//checking for negative values
		if (n < 0) {
			System.out.println("The value must be positive");
			return -1;
			
		}
		else {
			
			if (n == 0) {
				
				return count;
				
			}
			else {
				
				 method6(n - 1);
				 method6(n - 1);
				 count++;
				 return count;
			}	
		}
	} 
	

	public static void main(String[] args) {
		
		System.out.println("Method of time complexity O(n^2): ");			
		method1(2);
		
		System.out.println("Method of time complexity O(n^3): ");
		method2(2);
		
		System.out.println("Method of time complexity O(logn): ");
		method3(4);
		
		System.out.println("Method of time complexity O(nlogn): ");
		method4(4);
		
		System.out.println("Method of time complexity O(loglogn): ");
		method5(256);
		
		System.out.println("Method of time complexity O(2^n): ");
		
		int counter = method6(4);
		
		System.out.println("Total number of operations for time complexity O(2^n) is " + counter);

	}

}
