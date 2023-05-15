package com.storehouse.model;

import java.time.LocalDate;
import java.util.Objects;

public class OrderDto {
	
	public long number;
	public LocalDate placementDate;
	public String product;
	public int amount;
	public String measurementUnit;
	public int containerNumber;
	public boolean open;
	
	public OrderDto(long number, LocalDate placementDate, String product, int amount, String measurementUnit,
			int containerNumber, boolean open) {
		this.number = number;
		this.placementDate = placementDate;
		this.product = product;
		this.amount = amount;
		this.measurementUnit = measurementUnit;
		this.containerNumber = containerNumber;
		this.open = open;
	}
	
	public OrderDto() {}

	@Override
	public String toString() {
		return "OrderDto [number=" + number + ", placementDate=" + placementDate + ", product=" + product + ", amount="
				+ amount + ", measurementUnit=" + measurementUnit + ", containerNumber=" + containerNumber + ", open="
				+ open + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, containerNumber, measurementUnit, number, open, placementDate, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDto other = (OrderDto) obj;
		return amount == other.amount && containerNumber == other.containerNumber
				&& Objects.equals(measurementUnit, other.measurementUnit) && number == other.number
				&& open == other.open && Objects.equals(placementDate, other.placementDate)
				&& Objects.equals(product, other.product);
	};

}
