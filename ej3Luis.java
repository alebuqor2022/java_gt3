public class Main {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new MyRunnable(), "Larry");
    Thread thread2 = new Thread(new MyRunnable(), "Moe");
    Thread thread3 = new Thread(new MyRunnable(), "Curly");

    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName() + ": " + i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
