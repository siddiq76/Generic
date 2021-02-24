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
	
	/* Maximum Float element at the position 1 */
	@Test
	public void maximumFloatAtPosition1() {
		Float maximumFloat = FindMax.maximumFloat(18.25f, 8.249f, 15.2495f);
		Assert.assertEquals((Float) 18.25f, maximumFloat);
	}

	/* Maximum Float element at the position 2 */
	@Test
	public void maximumFloatAtPosition2() {
		Float maximumFloat = FindMax.maximumFloat(15.25f, 18.99f, 8.62f);
		Assert.assertEquals((Float) 18.99f, maximumFloat);
	}

	/* Maximum Float element at the position 3 */
	@Test
	public void maximumFloatAtPosition3() {
		Float maximumFloat = FindMax.maximumFloat(8.46f, 15.0f, 18.25f);
		Assert.assertEquals((Float) 18.25f, maximumFloat);
	}
	
	/* Maximum String at the position 1 */
	@Test
	public void maximumStringAtPosition1() {
		String maximumString = FindMax.maximumString("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", maximumString);
	}

	/* Maximum String at the position 2 */
	@Test
	public void maximumStringAtPosition2() {
		String maximumString =FindMax.maximumString("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", maximumString);
	}

	/* Maximum String at the position 3 */
	@Test
	public void maximumStringAtPosition3() {
		String maximumString = FindMax.maximumString("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", maximumString);
	}
}
