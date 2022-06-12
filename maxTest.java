import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void test() {
		int arr[] = {22,2,21,15,7,3,14,77};
		UnitTesting obj=new UnitTesting();
		int output=obj.getmax(arr);
		assertEquals(77, output);
	}

}
