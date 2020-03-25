package com.epam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Remove_A {
	
	/*
	 * "ABCD" => "BCD"
	 * "AACD" => "CD"
	 * "BACD" => "BCD"
	 * "BBAA" => "BBAA"
	 * "AABAA" => "BAA"
	 */

	@Test
	void test1char() {
		A_Remove rm = new A_Remove();
		@SuppressWarnings("static-access")
		String actual = rm.remove_A("ABCD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void test2char() {
		A_Remove rm = new A_Remove();
		String actual = rm.remove_A("AACD");
		assertEquals("CD", actual);
	}
	
	@Test
	void testMiddlechar() {
		A_Remove rm = new A_Remove();
		String actual = rm.remove_A("BACD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void testNochar() {
		A_Remove rm = new A_Remove();
		String actual = rm.remove_A("");
		assertEquals("", actual);
	}
	
	@Test
	void testLastchar() {
		A_Remove rm = new A_Remove();
		String actual = rm.remove_A("BBAA");
		assertEquals("BBAA", actual);
	}
	
	@Test
	void testMultichar() {
		A_Remove rm = new A_Remove();
		String actual = rm.remove_A("AABAA");
		assertEquals("BAA", actual);
	}
	
}
