package clase4_Threads;

public class MyStack {
	int idx = 0;
	char [] data = new char[400];
	
	public void push(char c) {
		  synchronized (this) {
	    data[idx] = c;
	    idx++;
		  }
	  }

	  public char pop() {
		  synchronized (this) {
	    idx--;
	    return data[idx]; // LIFO = LAST IN FIRST OUT
	  }
	  }
	
}
