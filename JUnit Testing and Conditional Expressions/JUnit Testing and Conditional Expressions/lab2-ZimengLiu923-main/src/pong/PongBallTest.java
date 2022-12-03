package pong;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Zimeng Liu & Vy Phung
 * @version 09/12/2022
 */

public class PongBallTest {

	@Test
	public void testPongBall() {
		PongBall ball = new PongBall(50, 50, 10, 10);

		assertEquals(50, ball.getHorizPos());
		assertEquals(50, ball.getVertPos());
		assertEquals(10, ball.getHorizSpeed());
		assertEquals(10, ball.getVertSpeed());
	}
	@Test
	public void testMove() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		ball.move();
		assertEquals("Incorrect Horizontal Position", 60, ball.getHorizPos());
		assertEquals("Incorrect Vertical Position", 60, ball.getVertPos());
	}
	@Test
	public void testHorizBounce() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		ball.horizBounce();
		assertEquals("Incorrect Horizontal Speed", -10, ball.getHorizSpeed());
	}
	@Test
	public void testVertBounce() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		ball.vertBounce();
		assertEquals("Incorrect Vertical Speed", -10, ball.getVertSpeed());
	}
	
	@Test
	public void testgetHorizPos() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		assertEquals("getHorizPos() Incorrect", 50, ball.getHorizPos());
	}
	
	@Test
	public void testgetVertPos() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		assertEquals("getVertPos() Incorrect", 50, ball.getVertPos());
	}
	@Test
	public void testgetHorizSpeed() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		assertEquals("getHorizPos() Incorrect", 10, ball.getHorizSpeed());
	}
	@Test
	public void testgetVertSpeed() {
		PongBall ball = new PongBall(50, 50, 10, 10);
		assertEquals("getVertPos() Incorrect", 10, ball.getVertSpeed());
	}
}
