import rs.bg.spring.service.CustomerService;
import rs.bg.spring.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService service=new CustomerServiceImpl();
		
		//happy path
		System.out.println(service.findAll().get(0).getName());

	}

}
