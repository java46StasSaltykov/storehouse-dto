package com.storehouse.model;

import java.util.Objects;

public class ContainerToRefill {
	
	public int number;
	public String product;
	public String measureUnit;
	public int amountToAdd;
	
	public ContainerToRefill(int number, String product, String measureUnit, int amountToAdd) {
		this.number = number;
		this.product = product;
		this.measureUnit = measureUnit;
		this.amountToAdd = amountToAdd;
	}
	
	public ContainerToRefill() {}

	@Override
	public String toString() {
		return "LackOfContainer [number=" + number + ", product=" + product + ", measureUnit=" + measureUnit
				+ ", amountToAdd=" + amountToAdd + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountToAdd, measureUnit, number, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContainerToRefill other = (ContainerToRefill) obj;
		return amountToAdd == other.amountToAdd && Objects.equals(measureUnit, other.measureUnit)
				&& number == other.number && Objects.equals(product, other.product);
	};

}
