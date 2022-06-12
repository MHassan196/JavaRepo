import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	@Test
	public void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.countA("Africa");
		assertEquals(2, output);
	}

}
