package epidemic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HealthWorkerTest {

	HealthWorker hw=new HealthWorker("hw","apollo","hw@123");

	@Test
	void testGetTestRequest() {
		assertEquals(hw.getTestRequest(),true);
	}

	@Test
	void testUpdateTestResult() {
		assertEquals(hw.updateTestResult(new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc")),true);
	}

	@Test
	void testGetHealthStatus() {
		assertEquals(hw.getHealthStatus(new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc")),true);
	}

	@Test
	void testUpdateRecommendation() {
		assertEquals(hw.updateRecommendation(new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc")),true);
	}

	@Test
	void testGetPatientsList() {
		assertEquals(hw.getPatientsList(),true);
	}

	@Test
	void testRequestApproval() {
		assertEquals(hw.getTestRequest(),true);
	}

}
