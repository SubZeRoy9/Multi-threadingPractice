
public class MainClass {
	static int[] arr = {12, 75, 30, 91, 49, 52, 76};
	int min; //min integer to be used in MyThread1
	int max; //max integer to be used in MyThread2
	int average; //average integer to be used in MyThread3
	public static void main(String[] args) {
		print(arr);
		
		/* MyThread1 finds min
		 * MyThread2 finds max
		 * MyThread3 finds average */
		
		MyThread1 runnable1 = new MyThread1();
		Thread thread1 = new Thread(runnable1);
		
		MyThread2 runnable2 = new MyThread2();
		Thread thread2 = new Thread(runnable2);
		
		MyThread3 runnable3 = new MyThread3();
		Thread thread3 = new Thread(runnable3);
		
		thread1.run();
		thread2.run();
		thread3.run();
	}
	
/******************prints the array******************/
	public static void print(int[] arr) {
	System.out.println("The numbers are ...");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println("\n"); // makes two lines to separate print method from threads
	
	}
	

}
