package org.mindhub.generics;

/*
 * K - key
 * V - value
 * E - element
 * T - type
 * N - number
 * R - result
 * U - unit
 * S - second
 */

public class Couple<K extends Comparable<K> & CharSequence, V> {
	private K key;
	private V value;

	public Couple() {
		// TODO Auto-generated constructor stub
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Couple [key=" + key + ", value=" + value + "]";
	}

}
