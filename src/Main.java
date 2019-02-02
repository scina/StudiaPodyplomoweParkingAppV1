//import controllers.MainController;
import controllers.ParkingController;
import models.parking.Parking;
import models.vehicles.Car;
import models.vehicles.Vehicle;
import views.MainView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(100);
        ParkingController parkingController = new ParkingController();
        MainView mainView = new MainView();
//        MainController mainController = new MainController();
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle;

        boolean exit = false;
        mainView.writeVehicleRegistrationNumber();
        String vehicleIdentificationNumber = scanner.nextLine();

        vehicle = new Car(vehicleIdentificationNumber);
        mainView.vehicleRegisterQuestion();
        if(parkingController.registerNewVehicle(vehicle, parking)) {
            mainView.registerMessage(vehicle.getVehicleIdentificationNumber());
        } else {
            mainView.registerErrorMessage();
        }

        while (!exit) {
            mainView.appTitle();
            mainView.showOptions();
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    if (parkingController.registerEntryVehicle(vehicle, parking)) {
                        mainView.enterMessage();
                    } else {
                        mainView.entryErrorMessage();
                    }
                    break;
                case "2":
                    if (parkingController.registerExitVehicle(vehicle, parking)) {
                        mainView.exitMessage();
                    } else {
                        mainView.exitErrorMessage();
                    }
                    break;
                case "3":
                    mainView.goodbyeMessage();
                    exit = true;
                    break;
                default:
                    mainView.optionError(option);
            }
        }

    }
}
