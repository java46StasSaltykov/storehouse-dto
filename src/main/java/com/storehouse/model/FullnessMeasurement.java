package com.storehouse.model;

import java.util.Objects;

public class FullnessMeasurement {
	
	public Container container;
	public int currentStatus;
	
	public FullnessMeasurement(Container container, int currentStatus) {
		this.container = container;
		this.currentStatus = currentStatus;
	}
	
	public FullnessMeasurement() {}

	@Override
	public String toString() {
		return "FullnessMeasurement [container=" + container + ", currentStatus=" + currentStatus + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(container, currentStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FullnessMeasurement other = (FullnessMeasurement) obj;
		return Objects.equals(container, other.container) && currentStatus == other.currentStatus;
	};

}
