package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arraySize = 0;

	@Override
	public boolean add(T item) {
		return add(arraySize, item);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > arraySize)
			throw new IndexOutOfBoundsException("Array out of bound");
		if (items.length == arraySize) {
			items = increaseArraySize();
		}
		items[index] = item;
		arraySize++;
		return true;
	}

	private Object[] increaseArraySize() {
		Object[] newArray = new Object[items.length * 2];
		for (int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return arraySize;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > arraySize)
			throw new IndexOutOfBoundsException("Array out of bound Exception");
		return (T) items[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index > arraySize)
			throw new IndexOutOfBoundsException("Array out of bound Exception");
		T removedItem = (T) items[index];

		for (int i = index; i < arraySize - 1; i++) {
			items[i] = items[i + 1];
		}
		arraySize--;
		return removedItem;
	}

}
