package com.coderscampus;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<String>();

		for (int i = 0; i < 10; i++) {
			myCustomList.add("Hello" + i);
		}
		for (int i = 10; i < 20; i++) {
			myCustomList.add(i, "Hello" + i);
		}

		// display
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		System.out.println("---------------------");
		// remove
		System.out.println(myCustomList.remove(1));
		System.out.println(myCustomList.remove(3));
		System.out.println("---------------------");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		System.out.println("---------------------");
		System.out.println(myCustomList.get(10));
	}
	

}
