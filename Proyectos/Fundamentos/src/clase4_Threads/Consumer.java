package clase4_Threads;

public class Consumer implements Runnable {
//private MyStack theStack;
private SyncStack theStack;
private int num;
private static int counter=1;
	 
public Consumer(SyncStack s) {
	 this.theStack=s;
	 num=counter++;
}

@Override
public void run() {
char c;
for(int i= 0; i <200 ; i++) {
	c=this.theStack.pop();
	System.out.println("Consumer " + num + ": " + c);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}	 
}
}


