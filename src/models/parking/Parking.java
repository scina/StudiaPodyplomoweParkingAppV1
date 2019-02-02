package models.parking;

import models.VehicleIdentification;
import models.vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private List<ParkingPlace> placesForVehicles;
    private List<VehicleIdentification> authorizedVehicle;
    private List<VehicleIdentification> vehiclesInTheParking;

    private Car sampleCar01 = new Car("DW 93666");
    private Car sampleCar02 = new Car("DW 95666");
    private Car sampleCar03 = new Car("DW 97666");
    private Car sampleCar04 = new Car("DW 916OT");
    private Car sampleCar05 = new Car("DW 896PP");

    public Parking(int numbersOfPlacesForVehicles) {
        placesForVehicles = new ArrayList<>();
        authorizedVehicle = new ArrayList<>();
        vehiclesInTheParking = new ArrayList<>();
        createParkingPlaces(numbersOfPlacesForVehicles);
        addSampleAuthorizedVehicles();
        addSampleVehicleToTheParking();
    }

    private void createParkingPlaces(int numbersOfPlaces) {
        for(int i = 1; i <= numbersOfPlaces; i++) {
            this.placesForVehicles.add(new ParkingPlace(i));
        }
    }
    //add a sample list of authorized vehicle
    private void addSampleAuthorizedVehicles() {
        authorizedVehicle.add(sampleCar01);
        authorizedVehicle.add(sampleCar02);
        authorizedVehicle.add(sampleCar03);
        authorizedVehicle.add(sampleCar04);
        authorizedVehicle.add(sampleCar05);
    }

    private void addSampleVehicleToTheParking() {
        vehiclesInTheParking.add(sampleCar01);
        vehiclesInTheParking.add(sampleCar05);
    }

    public List<ParkingPlace> getPlacesForVehicles() {
        return placesForVehicles;
    }

    public List<VehicleIdentification> getAuthorizedVehicle() {
        return authorizedVehicle;
    }

    public List<VehicleIdentification> getVehiclesInTheParking() {
        return vehiclesInTheParking;
    }
}
