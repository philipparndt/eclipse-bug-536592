package a.testfragment;

import a.SomeStuffInA;
import testsupport.TestHelper;

public class SomeTest {
	public SomeTest() {
		assert (new TestHelper().add(1, 2) == new SomeStuffInA().add(2, 1));
	}
}
