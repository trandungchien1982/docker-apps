package example;

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
    public void testFailChien() {
		log.info("Start testFailChien ... ");
		assertEquals("Not equals for Values ...", "Duong xua chung bong", "Duong xua 123 chung bong");		
		assertTrue(false);
		log.info("Stop testFailChien ... DONE.");
    }
	
}
