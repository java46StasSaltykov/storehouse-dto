package com.storehouse.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class ContainerMeasurementDto {
	
	public ContainerDto container;
	public int currentStatus;
	LocalDateTime timeStamp;
	
	public ContainerMeasurementDto(ContainerDto container, int currentStatus) {
		this.container = container;
		this.currentStatus = currentStatus;
		this.timeStamp = LocalDateTime.now();
	}
	
	public ContainerMeasurementDto() {}

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
		ContainerMeasurementDto other = (ContainerMeasurementDto) obj;
		return Objects.equals(container, other.container) && currentStatus == other.currentStatus;
	};

}
