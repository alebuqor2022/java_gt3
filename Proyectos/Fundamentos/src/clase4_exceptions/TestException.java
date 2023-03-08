package clase4_exceptions;

public class TestException {

	public static void main(String[] args) {
		Conexion c=new Conexion();
		
		try {
			c.conectar("Indra");
		} catch (ServerTimeOutException e) {
			System.out.println(e.getMessage() + " al puerto " + e.getPuerto());
			//e.printStackTrace();
		}catch(Exception e1) {
			System.out.println("otra exception");
		}finally {
			System.out.println("fin");
		}

	}

}
