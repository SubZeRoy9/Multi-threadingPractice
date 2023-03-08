
public class MyThread1 extends MainClass implements Runnable{
	//extends MainClass so it can have access to the array;
	@Override
	public void run() {
		min = arr[0]; //sets first element in array = min;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The minimum value is " + min);
		
		
	}
}
