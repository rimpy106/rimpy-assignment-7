package com.coderscampus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_beginning_of_list() {
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		// Act
		listofNum.add(0, 5);
		// Assert
		assertEquals(5, listofNum.get(0));
		assertEquals(1, listofNum.getSize());
	}

	@Test
	void should_add_middle_of_list() {
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listofNum.add(i + 1);
		}
		// Act
		listofNum.add(5, 10);
		// Assert
		assertEquals(10, listofNum.get(5));
		assertEquals(11, listofNum.getSize());
	}

	@Test
	void should_add_end_of_list() {
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listofNum.add(i + 1);
		}
		// Act
		listofNum.add(10, 10);
		// Assert
		assertEquals(10, listofNum.get(10));
		assertEquals(11, listofNum.getSize());
	}

	@Test
	void should_remove_beginning_from_list() {
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listofNum.add(i + 1);
		}
		// Act
		int removedNum = listofNum.remove(0);
		// Assert
		assertEquals(1, removedNum);
		assertEquals(9, listofNum.getSize());
	}

	@Test
	void should_remove_middle_from_list() {
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listofNum.add(i + 1);
		}
		// Act
		int removedNum = listofNum.remove(5);
		// Assert
		assertEquals(6, removedNum);
		assertEquals(9, listofNum.getSize());
	}

	@Test
	void should_remove_end_from_list() {
		// Arrange
		// Arrange
		CustomList<Integer> listofNum = new CustomArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			listofNum.add(i + 1);
		}
		// Act
		int removedNum = listofNum.remove(9);
		// Assert
		assertEquals(10, removedNum);
		assertEquals(9, listofNum.getSize());
	}

}
