package models.parking;

import models.vehicles.Vehicle;

public class ParkingPlace {
    private Vehicle vehicle;
    private int placeNumber;
    private boolean isPlaceFree;

    ParkingPlace(int placeNumber){
        this.placeNumber = placeNumber;
        this.isPlaceFree = true;
        this.vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public boolean isPlaceFree() {
        return isPlaceFree;
    }

    public void setPlaceFree(boolean placeFree) {
        isPlaceFree = placeFree;
    }
}
