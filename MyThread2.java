
public class MyThread2 extends MainClass implements Runnable{
	//Extends Main class to have access to the array.
	@Override
	public void run() {
		max = arr[0]; //initializes max with first element in the array.
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The max element is " + max);
	}
}
