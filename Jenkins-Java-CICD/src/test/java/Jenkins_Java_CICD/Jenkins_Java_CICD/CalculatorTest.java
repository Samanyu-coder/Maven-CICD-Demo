package Jenkins_Java_CICD.Jenkins_Java_CICD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	void testAddition()
	{
		Calculator calc=new Calculator();
		int result=calc.add(2, 3);
		assertEquals(5,result);
	}
}
