package pong;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Vy Phung
 * @version 09/08/2022
 */

public class PongPaddleTest {

	@Test
	public void testPongPaddle() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		assertEquals("Incorrect", 0,paddle.getTopEdgePos());
		assertEquals("Incorrect", 0,paddle.getLeftEdgePos());
		assertEquals("Incorrect", 10,paddle.getRightEdgePos());
		assertEquals("Incorrect", 10,paddle.getBottomEdgePos());
	}
	
	@Test
	public void moveUp() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		paddle.moveUp(10);
		assertEquals("Incorrect", -10,paddle.getTopEdgePos());
	}
	
	@Test
	public void moveDown() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		paddle.moveDown(10);
		assertEquals("Incorrect", 10,paddle.getTopEdgePos());
	}
	
	@Test
	public void getLeftEdgePos() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		assertEquals("getLeftEdgePos() Incorrect", 0,paddle.getLeftEdgePos());
	}
	
	@Test
	public void getTopEdgePos() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		assertEquals("getTopEdgePos() Incorrect", 0,paddle.getTopEdgePos());
	}
	
	@Test
	public void getRightEdgePos() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		assertEquals("getRightEdgePos() Incorrect", 10,paddle.getRightEdgePos());
	}
	
	@Test
	public void getBottomEdgePos() {
		PongPaddle paddle = new PongPaddle(0,0,10,10);
		assertEquals("getBottomEdgePos() Incorrect", 10,paddle.getBottomEdgePos());
	}

}
