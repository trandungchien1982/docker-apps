package example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;

public class ExampleTest {
	
	Logger log = Logger.getLogger(ExampleTest.class);
    
	@Test
    public void testJoin() {
		log.info("Start testJoin ... ");
		assertEquals("Joined string didn't match", "1 2 3", Example.join("1", "2", "3"));		
		assertTrue(true);
		log.info("Stop testJoin ... DONE.");
    }

	@Test
    public void testJoinSecond() {
		log.info("Start testJoinSecond ... ");
		assertEquals("Joined string didn't match", "5 6", Example.join("5", "6"));		
		assertTrue(true);
		log.info("Stop testJoinSecond ... DONE.");
    }	
	
	@Test
    public void testJoinThird() {
		log.info("Start testJoinThird ... ");
		assertEquals("Joined string didn't match", "5 6", Example.join("5", "6"));		
		assertTrue(true);
		log.info("Stop testJoinThird ... DONE.");
    }	
	
	@Test
    public void testJoinFourth() {
		log.info("Start testJoinFourth ... ");
		assertEquals("Joined string didn't match", "5 6", Example.join("5", "6"));		
		assertTrue(true);
		log.info("Stop testJoinFourth ... DONE.");
    }	
	
	@Test
    public void testFailChien() {
		log.info("Start testFailChien ... ");
		assertEquals("Not equals for Values ...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testFailChien ... DONE.");
    }
	
	@Test
    public void testFailThuHai() {
		log.info("Start testFailThuHai ... ");
		assertEquals("Not equals for Values 12222...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testFailThuHai ... DONE.");
    }
	
	@Test
	@Ignore("Thich thi ignore thoi")
    public void testIgnoreThuNhat() {
		log.info("Start testIgnoreThuNhat ... ");
		assertEquals("Not equals for Values 12222...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testIgnoreThuNhat ... DONE.");
    }
	
	@Test
	@Ignore("Thich thi ignore thoi 2222")
    public void testIgnoreThuHai() {
		log.info("Start testIgnoreThuHai ... ");
		assertEquals("Not equals for Values 12222...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testIgnoreThuHai ... DONE.");
    }
	
	@Test
	@Ignore("Thich thi ignore thoi 333")
    public void testIgnoreThuBa() {
		log.info("Start testIgnoreThuBa ... ");
		assertEquals("Not equals for Values 12222...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testIgnoreThuBa ... DONE.");
    }		
}
