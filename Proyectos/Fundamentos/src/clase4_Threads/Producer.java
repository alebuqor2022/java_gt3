package clase4_Threads;

public class Producer implements Runnable {
//private MyStack theStack;
 private SyncStack theStack;
 private int num;
 private static int counter=1;
 
 public Producer(SyncStack s) {
	 this.theStack=s;
	 num=counter++;
 }

@Override
public void run() {
	char c;
	for(int i= 0; i <200 ; i++) {
		c=(char)(Math.random() * 26 + 'A');
		this.theStack.push(c);
		System.out.println("Producer " + num + ": " + c);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
