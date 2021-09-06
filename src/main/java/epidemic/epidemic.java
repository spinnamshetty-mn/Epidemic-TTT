package epidemic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class epidemic {

	public static void main(String[] args) {
		
		SpringApplication.run(epidemic.class, args);
		Patient p1=new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc");
		Patient p2=new Patient("abc2","userabc2","mumbai","abc@gmail.com","123@abc");
		Patient p3=new Patient("abc3","userabc3","allahabad","abc@gmail.com","123@abc");
		Patient p4=new Patient("abc4","userabc4","chennai","abc@gmail.com","123@abc");
		
		
		
	}
	
	

}
