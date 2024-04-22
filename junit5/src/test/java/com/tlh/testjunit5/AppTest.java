package com.tlh.testjunit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {
	@BeforeAll
	public  void beforeAll() {
		System.out.println("BEFORE ALL");
	}
	
	@AfterAll
	public  void afterAll() {
		System.out.println("AFTER ALL");
	}
	
	@BeforeEach
	public  void beforeEach() {
		System.out.println("BEFORE EACH");
	}
	
	@AfterEach
	public  void afterEach() {
		System.out.println("AFTER EACH");
	}
	
	@Test
	public void testNtChan() {
		int n = 2;
		boolean expected = true;
		boolean actual = KiemtraNguyento.ktnt(n);
		
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testNtLe() {
		int n = 7;
		boolean actual = KiemtraNguyento.ktnt(n);
		
		Assertions.assertTrue(actual);
	}
}