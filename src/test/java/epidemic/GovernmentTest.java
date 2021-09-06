package epidemic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GovernmentTest {
	
	Government gov=new Government("government","gov@123");
	
	@Test
	void testGetApprovalRequest() {
		assertEquals(gov.getApprovalRequest(),true);
		
	}

	@Test
	void testGiveApproval() {
		assertEquals(gov.giveApproval(),true);
	}

	@Test
	void testViewRequests() {
		assertEquals(gov.viewRequests(),true);
	}

	@Test
	void testViewResults() {
		assertEquals(gov.viewResults(),true);
	}

	@Test
	void testViewUpdatedStatus() {
		assertEquals(gov.viewUpdatedStatus(),true);
	}

	@Test
	void testSearchContacted() {
		assertEquals(gov.searchContacted(new Patient("abc1","userabc1","hyderabad","abc@gmail.com","123@abc")),true);
	}

	@Test
	void testSetZone() {
		assertEquals(gov.setZone(),true);
	}

	@Test
	void testViewPositiveResults() {
		assertEquals(gov.viewPositiveResults(),true);
	}

}
