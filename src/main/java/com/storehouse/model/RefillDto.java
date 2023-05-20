package com.storehouse.model;

import java.util.Objects;

public class RefillDto {
	
	public int containerNumber;
	public String product;
	public String measureUnit;
	public int amountToAdd;
	
	public RefillDto(int containerNumber, String product, String measureUnit, int amountToAdd) {
		this.containerNumber = containerNumber;
		this.product = product;
		this.measureUnit = measureUnit;
		this.amountToAdd = amountToAdd;
	}
	
	public RefillDto() {}

	@Override
	public String toString() {
		return "RefillDto [containerNumber=" + containerNumber + ", product=" + product + ", measureUnit=" + measureUnit
				+ ", amountToAdd=" + amountToAdd + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountToAdd, measureUnit, containerNumber, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RefillDto other = (RefillDto) obj;
		return amountToAdd == other.amountToAdd && Objects.equals(measureUnit, other.measureUnit)
				&& containerNumber == other.containerNumber && Objects.equals(product, other.product);
	};

}
