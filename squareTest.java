import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.square(5);
		assertEquals(25, output);

	}

}
