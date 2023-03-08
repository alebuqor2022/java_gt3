package clase4_Threads;

public class TestRunner {

	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);
		t.start();

	}

}
