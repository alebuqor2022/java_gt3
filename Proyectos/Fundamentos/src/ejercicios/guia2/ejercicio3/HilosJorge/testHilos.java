package HilosJorge;

public class testHilos{
  
  public static void main(String args[]){ 
	  Runner r1 = new Runner();
	  Runner r2 = new Runner();
	  Runner r3 = new Runner();
	  Thread t1 = new Thread(r1);
	  Thread t2 = new Thread(r2);
	  Thread t3 = new Thread(r3);
	  t1.setName("Larry");
	  t2.setName("Moe");
	  t3.setName("Curly");
	  t1.start();  
	  t2.start();  
	  t3.start();
	
  }  

}
