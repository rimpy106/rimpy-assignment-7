package com.coderscampus;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<String>();
		// add
		/*
		 * for (int i = 0; i < 10; i++) { myCustomList.add("Hello" + (i + 1)); }
		 */

		for (int i = 0; i < 10; i++) {
			myCustomList.add(i, "Hello" + i);
		}

		// display
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		// boolean addedItem4=myCustomList.add(2,"Hello4");
//remove
		System.out.println(myCustomList.remove(1));

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}

}
