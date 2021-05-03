
import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Burak");
		customer.setLastName("Koca");
		customer.setNationalityId(1111111111);
		customer.setDateOfBirth(1994);
		
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(customer);

	}

}
