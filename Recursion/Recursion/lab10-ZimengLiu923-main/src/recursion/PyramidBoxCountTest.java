package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class PyramidBoxCountTest {

	@Test
	public void testComputePyramidBoxes() {
		assertEquals("Failed",2, PyramidBoxCount.computePyramidBoxes(2));
		assertEquals("Failed",1, PyramidBoxCount.computePyramidBoxes(1));
		assertEquals("Failed",20, PyramidBoxCount.computePyramidBoxes(8));
		assertEquals("Failed",16, PyramidBoxCount.computePyramidBoxes(7));
	}

}
