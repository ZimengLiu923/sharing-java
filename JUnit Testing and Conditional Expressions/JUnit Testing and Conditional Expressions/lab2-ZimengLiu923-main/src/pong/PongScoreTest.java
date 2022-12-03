package pong;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Zimeng Liu
 * @version 09/12/2022
 */

public class PongScoreTest {

	@Test
	public void testPongScore() {
		PongScore score = new PongScore();
		assertEquals("Incorrect Score", 0, score.getScore());
	}
	@Test
	public void testGetScore() {
		PongScore score = new PongScore();
		assertEquals("getScore() Incorrect", 0, score.getScore());
	}
	
	@Test
	public void testScorePoints() {
		PongScore score = new PongScore();
		score.scorePoints(2);
		assertEquals("Incorrect Score", 2, score.getScore());
	}

}
