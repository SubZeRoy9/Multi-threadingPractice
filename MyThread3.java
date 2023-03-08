
public class MyThread3 extends MainClass implements Runnable{
	//Extends MainClass to have access to the array.
	@Override 
	public void run() {
		average = 0;
		for (int i = 0; i < arr.length; i++) {
			average += arr[i];
		}
		int mod = average % arr.length; //stores the remainder
		average = average / arr.length; //divides the sum of all the elements by number of elements
		average = average + mod; //adds the remainder to the average
		
		System.out.println("The average is " + average);
	}
}
