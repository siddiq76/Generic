package com.Generics.Findmax;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {
	/* Welcome message test method */
	@Test
	public void shouldPrintWelcomeMessage() {
		FindMax.printWelcomeMessage();
	}

	/* Maximum Integer element at the position 1 */
	@Test
	public void maximumIntegerAtPosition1() {
		Integer maximumInteger = FindMax.maximumInteger(18, 8, 15);
		Assert.assertSame(18, maximumInteger);
	}

	/* Maximum Integer element at the position 2 */
	@Test
	public void maximumIntegerAtPosition2() {
		Integer maximumInteger = FindMax.maximumInteger(15, 18, 8);
		Assert.assertSame(18, maximumInteger);
	}

	/* Maximum Integer element at the position 3 */
	@Test
	public void maximumIntegerAtPosition3() {
		Integer maximumInteger = FindMax.maximumInteger(15, 8, 18);
		Assert.assertSame(18, maximumInteger);
	}
}
