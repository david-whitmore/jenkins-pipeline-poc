import static org.junit.Assert.fail;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void sayHello_doesNotThrowException() throws Exception {
		new HelloWorld().sayHello();
		fail();
	}
}
