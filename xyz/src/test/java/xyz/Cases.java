package xyz;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cases {

	RemoveFun r=new RemoveFun();
	@Test
	public void test() {
		assertEquals("BCD",r.remove("ABCD"));
		assertEquals("CD",r.remove("AACD"));
		assertEquals("BCD",r.remove("BACD"));
		assertEquals("BBAA",r.remove("BBAA"));
		assertEquals("BAA",r.remove("AABAA"));
	}

}
