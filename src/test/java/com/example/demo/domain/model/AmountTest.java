package com.example.demo.domain.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmountTest {

	@Test
	void test() {
		Amount one = Amount.create(1);
		assertEquals(1, one.value());
	}
	
	@Test
	void equals実装を確認() {
		Amount two = Amount.create(2);
		Amount other = Amount.create(2);
		Amount three = Amount.create(3);
		assertEquals(other, two);
		assertEquals(other.hashCode(), two.hashCode());
		System.out.println(two.hashCode());
		assertNotEquals(three, two);
		assertNotEquals(three.hashCode(),two.hashCode());
		System.out.println(three.hashCode());
		System.out.println(two);
	}
	
	@Test
	void 加法のテスト3たす4と7が等しい(){
		Amount three = Amount.create(3);
		Amount four = Amount.create(4);
		Amount actual = three.plus(four);
		assertEquals(Amount.create(7), actual);
	}
	
	@Test
	void 加法のテスト() {
		Amount minusOne = Amount.create(-1);
		Amount minusThree = Amount.create(-3);
		Amount actual = minusOne.plus(minusThree);
		assertNotEquals(Amount.create(-5), actual);
		assertEquals(Amount.create(-4),actual);
	}
	
	@Test
	void 減法のテスト() {
		Amount seven = Amount.create(7);
		Amount twelve = Amount.create(12);
		Amount actual = seven.minus(twelve);
		assertEquals(Amount.create(-5), actual);
		assertNotEquals(Amount.create(-6),actual);
	}
	@Test
	void 比較のテスト() {
		assertTrue(Amount.create(4).isGreaterThanOrEqualTo(Amount.create(4)));
		assertTrue(Amount.create(4).isGreaterThanOrEqualTo(Amount.create(3)));
		assertFalse(Amount.create(4).isGreaterThanOrEqualTo(Amount.create(5)));
	}

}
