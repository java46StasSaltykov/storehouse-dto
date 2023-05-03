package com.storehouse.model;

import java.util.Objects;

public class Container {
	
	public int number;
	public String product;
	public String measureUnit;
	public int capacity;
	
	public Container(int number, String product, String measureUnit, int capacity) {
		this.number = number;
		this.product = product;
		this.measureUnit = measureUnit;
		this.capacity = capacity;
	}
	
	public Container() {}

	@Override
	public String toString() {
		return "Container [number=" + number + ", product=" + product + ", measureUnit=" + measureUnit + ", capacity="
				+ capacity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, measureUnit, number, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		return capacity == other.capacity && Objects.equals(measureUnit, other.measureUnit) && number == other.number
				&& Objects.equals(product, other.product);
	};

}
