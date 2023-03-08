package clase4_exceptions;

public class Conexion {
	
public void conectar(String nombreServer) throws ServerTimeOutException {
	boolean exito;
	int puertoAconectar=80;
	exito=abrir(nombreServer, puertoAconectar);
	if(!exito) {
		throw new ServerTimeOutException("no me puedo conectar ", puertoAconectar);
	}
	
}

public boolean abrir(String nombreServer, int puertoAconectar) {
	System.out.println("estoy abriendo la conexion");
	return true;
}
}
