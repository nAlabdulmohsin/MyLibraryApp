package Library;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() { //add MyLibraryTest to the test suite
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(BookTest.class);
		suite.addTestSuite(PersonTest.class);
		//$JUnit-END$
		return suite;
	}

}
