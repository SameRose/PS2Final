package Base;

import static org.junit.Assert.*;

import Base.MyInteger;

import org.junit.Test;

public class MyInteger_Test {

	@Test
	public void test() {
		for (int a = 0; a < 10000; a++) {
			MyInteger m = new MyInteger(a);
			assertEquals(m.getiValue(), a);

		}
	}
	
	@Test
	public void test2() {
		for (int a = 0; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(m.isEven(), true);

		}
		for (int a = 1; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(m.isEven(), false);

		}
	}
	@Test
	public void test3() {
		for (int a = 0; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(m.isOdd(), false);

		}
		for (int a = 1; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(m.isOdd(), true);

		}
	}
	
	@Test
	public void test4() {
		
			MyInteger m = new MyInteger(7);
			assertEquals(m.isPrime(), true);
			MyInteger n = new MyInteger(6);
			assertEquals(n.isPrime(), false);
			MyInteger o = new MyInteger(31);
			assertEquals(o.isPrime(), true);
			MyInteger p = new MyInteger(88);
			assertEquals(p.isPrime(), false);
			MyInteger q = new MyInteger(97);
			assertEquals(q.isPrime(), true);

		
	}
	
	
	@Test
	public void test5() {
		for (int a = 0; a < 10000; a=a+2) {
			
			assertEquals(MyInteger.isEven(a), true);

		}
		for (int a = 1; a < 10000; a=a+2) {
			
			assertEquals(MyInteger.isEven(a), false);

		}
	}
	
	@Test
	public void test6() {
		for (int a = 0; a < 10000; a=a+2) {
			
			assertEquals(MyInteger.isOdd(a), false);

		}
		for (int a = 1; a < 10000; a=a+2) {
			
			assertEquals(MyInteger.isOdd(a), true);

		}
	}
	
	@Test
	public void test7() {
		
			
			assertEquals(MyInteger.isPrime(7), true);
			assertEquals(MyInteger.isPrime(6), false);
			assertEquals(MyInteger.isPrime(31), true);
			assertEquals(MyInteger.isPrime(88), false);
			assertEquals(MyInteger.isPrime(97), true);

		
	}
	
	
	@Test
	public void test8() {
		for (int a = 0; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(MyInteger.isEven(m), true);

		}
		for (int a = 1; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(MyInteger.isEven(m), false);

		}
	}
	@Test
	public void test9() {
		for (int a = 0; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(MyInteger.isOdd(m), false);

		}
		for (int a = 1; a < 10000; a=a+2) {
			MyInteger m = new MyInteger(a);
			assertEquals(MyInteger.isOdd(m), true);

		}
	}
	
	@Test
	public void test10() {
		
			MyInteger m = new MyInteger(7);
			assertEquals(MyInteger.isPrime(m), true);
			MyInteger n = new MyInteger(6);
			assertEquals(MyInteger.isPrime(n), false);
			MyInteger o = new MyInteger(31);
			assertEquals(MyInteger.isPrime(o), true);
			MyInteger p = new MyInteger(88);
			assertEquals(MyInteger.isPrime(p), false);
			MyInteger q = new MyInteger(97);
			assertEquals(MyInteger.isPrime(q), true);

		
	}
	
	@Test
	public void test11() {
		
			MyInteger m = new MyInteger(7);
			assertEquals(m.equals(7), true);
			MyInteger n = new MyInteger(6);
			assertEquals(n.equals(6), true);
			MyInteger o = new MyInteger(31);
			assertEquals(o.equals(31), true);
			MyInteger p = new MyInteger(88);
			assertEquals(p.equals(88), true);
			MyInteger q = new MyInteger(97);
			assertEquals(q.equals(98), false);

		
	}
	

	@Test
	public void test12() {
		
			MyInteger m = new MyInteger(7);
			
			MyInteger n = new MyInteger(6);
			assertEquals(n.equals(m), false);
			MyInteger o = new MyInteger(88);
			
			MyInteger p = new MyInteger(88);
			assertEquals(p.equals(o), true);
			

		
	}
	


}
