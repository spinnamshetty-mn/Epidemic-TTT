package epidemic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class epidemicTest {
	Patient p1=new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc");

	@Test
	public void testusername() {
		//username ,pass
		assertEquals("userabc1",p1.getUsername());	
	}
		
	@Test
	public void testpassword() {
		//username ,pass
		assertEquals("123@abc",p1.getPassword());	
	}

	@Test
	public void testResult() {
		assertEquals(0,p1.getResult());
	}
	
	@Test
	public void requestTest() {
		assertEquals(1,p1.requestTest());
	}
	
	@Test
	public void viewRecomm() {
		assertEquals(1,p1.viewRecommendation());
	}
	
	@Test
	public void upload() {
		assertEquals(1,p1.uploadStatus());
	}
	
}
