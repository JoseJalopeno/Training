package dev.soer.mathtests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dev.soer.testexample.MathOps;

public class MathOpsTest {
	
	@BeforeClass
	public static void sutUpBeforeClass() {
		System.out.println("Before class...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After class...");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before...");
	}
	
	@After
	public void tearDown() {
		System.out.println("After...");
	}

	@Test
	public void addTest() {
		System.out.println("Running add tests");
		// assertEquals(expected value, actual value)
		assertEquals(10, MathOps.add(5,5));
		assertEquals(12, MathOps.add(12, 0));
		
	}
	
	@Test
	public void minusTest() {
		System.out.println("Running minus test");
		assertEquals(8,  MathOps.minus(10,2));
	}

	@Test(expected = ArithmeticException.class)
	public void divideTest() {
		System.out.println("Running divide test");
		MathOps.divide(1,0);
	}
}