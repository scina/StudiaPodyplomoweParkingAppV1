package controllers;

import models.parking.ParkingPlace;
import models.vehicles.Vehicle;

public class ParkingPlaceController {
    public ParkingPlaceController(){

    }

    public void addVehiculeOnPlace(ParkingPlace parkingPlace, Vehicle vehicle) {
        parkingPlace.setVehicle(vehicle);
        parkingPlace.setPlaceFree(false);
    }

    public void removeVehicleFormPlace(ParkingPlace parkingPlace) {
        parkingPlace.setVehicle(null);
        parkingPlace.setPlaceFree(true);
    }

    public boolean checkPlaceIsFree(ParkingPlace parkingPlace) {
        return parkingPlace.isPlaceFree();
    }
}
