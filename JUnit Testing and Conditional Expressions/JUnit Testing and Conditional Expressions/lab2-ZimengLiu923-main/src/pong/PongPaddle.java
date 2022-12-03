package pong;

/**
 * This class describes objects that represent the paddles
 * in a Pong game.  Code within the PongGame constructs two
 * new PongPaddle objects and uses them to keep track of the
 * position of the players' paddles on the screen.  When a player
 * presses the up key (A or K) the PongGame calls the moveUp 
 * method of the appropriate paddle.  Similarly, the moveDown
 * method is called when a player presses the down key (Z or M).
 * 
 * @author Grant Braught, edited by John MacCormick
 * 
 * @author Vy Phung 
 * @version 09/06/2022
 */
public class PongPaddle {
    
    // Define the field(s) for your PongPaddle here.
	int pongTop; // the vertical coordinates of the top-left corner of the paddle
	int pongLeft; // the horizontal coordinates of the top-left corner of the paddle
	int pongWidth; //the width
	int pongHeight; // the height

    /** 
     * Construct a new PongPaddle at the specified position with the
     * specified width and height. Note that the values of the initTop 
     * and initLeft parameters specify the vertical and horizontal 
     * coordinates (respectively) of the top-left corner of the paddle.
     */
    public PongPaddle(int initTop, int initLeft, 
        int initWidth, int initHeight) {
        // Initialize the state of your PongPaddle here.
    	pongTop = initTop;
    	pongLeft = initLeft;
    	pongWidth = initWidth;
    	pongHeight = initHeight;
    }

    /**
     * Move this PongPaddle up by the specified distance.
     * 
     * @param distance the number of pixels by which this PongPaddle
     * should be moved up.
     */
    public void moveUp(int distance) {
        // Add code here to change the vertical position of this
        // PongPaddle.
    	pongTop -= distance;
    }

    /**
     * Move this PongPaddle down by the specified distance.
     * 
     * @param distance the number of pixels by which this PongPaddle
     * should be moved down.
     */
    public void moveDown(int distance) {
         // Add code here to change the vertical position of this
         // PongPaddle.
    	pongTop += distance;
    }

    /**
     * Return the horizontal position of the left edge of this 
     * PongPaddle.
     * 
     * @return the horizontal position of the left edge.
     */
    public int getLeftEdgePos() {
        // Change this to return the actual horizontal position
        // of the left edge of this PongPaddle.
        return pongLeft;
    }
    
    /**
     * Return the vertical position of the top edge of this 
     * PongPaddle.
     * 
     * @return the vertical position of the top edge.
     */
    public int getTopEdgePos() {
         // Change this to return the actual vertical position
        // of the top edge of this PongPaddle.
        return pongTop;
    }

    /**
     * Return the horizontal position of the right edge of this
     * PongPaddle.
     * 
     * @return the horizontal position of the right edge.
     */
    public int getRightEdgePos() {
         // Change this to return the actual horizontal position
        // of the right edge of this PongPaddle.
    	int pongRight = pongLeft + pongWidth; 
        return pongRight;
    }

    /**
     * Return the vertical position of the bottom edge of this
     * PongPaddle.
     * 
     * @return the vertical position of the bottom edge.
     */
    public int getBottomEdgePos() {
        // Change this to return the actual vertical position
        // of the bottom edge of this PongPaddle.  
    	int pongBot = pongTop + pongHeight;
        return pongBot;
    }
}

