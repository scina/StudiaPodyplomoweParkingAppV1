package controllers;

import models.VehicleIdentification;
import models.parking.Parking;
import models.vehicles.Vehicle;

public class ParkingController {

    public ParkingController() {

    }

    private boolean isVehicleInTheParking(Vehicle vehicle, Parking parking) {
        for (VehicleIdentification vI : parking.getVehiclesInTheParking()) {
            if (vI.getVehicleIdentificationNumber().equals(vehicle.getVehicleIdentificationNumber())) {
                return true;
            }
        }
        return false;
    }

    public boolean registerNewVehicle(Vehicle vehicle, Parking parking) {
        for (VehicleIdentification vI : parking.getAuthorizedVehicle()) {
            if (vI.getVehicleIdentificationNumber().equals(vehicle.getVehicleIdentificationNumber())) {
                return false;
            }
        }
        parking.getAuthorizedVehicle().add(vehicle);
        return true;
    }

    public boolean registerEntryVehicle(Vehicle vehicle, Parking parking) {
        if (isVehicleInTheParking(vehicle, parking)) {
            return false;
        }
        parking.getVehiclesInTheParking().add(vehicle);
        return true;
    }

    public boolean registerExitVehicle(Vehicle vehicle, Parking parking) {
        for (VehicleIdentification vI : parking.getVehiclesInTheParking()) {
            if (vI.getVehicleIdentificationNumber().equals(vehicle.getVehicleIdentificationNumber())) {

                parking.getVehiclesInTheParking().remove(vI);
                return true;
            }
        }
        return false;
    }
}
