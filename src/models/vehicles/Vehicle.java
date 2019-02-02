package models.vehicles;

import models.VehicleIdentification;

abstract public class Vehicle implements VehicleIdentification {
    private String vehicleIdentificationNumber;

    Vehicle(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    @Override
    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }
}
