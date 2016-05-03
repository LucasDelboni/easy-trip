import java.rmi.RemoteException;

import br.com.soma.*;

public class Consume {
	public static void main (String [] args) throws RemoteException{
		SomarProxy sp = new SomarProxy();
		double a = sp.getSomar().sum(1, 2);
		System.out.println(a);
	}
}
