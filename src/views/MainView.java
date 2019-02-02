package views;

public class MainView {
    public MainView(){

    }
    public void appTitle() {
        System.out.println("PARKING APP");
    }

    public void showOptions() {
        System.out.println("Choose option, what you want to do:");
        System.out.println("1. Enter to the parking");
        System.out.println("2. Exit from the parking");
        System.out.println("3. Close application");
    }

    public void optionError(String option) {
        System.out.println("There is no option: " + option);
    }

    public void goodbyeMessage() {
        System.out.println("Goodbye, have a nice day");
    }

    public void enterMessage() {
        System.out.println("you can enter the parking lot");
    }

    public void exitMessage() {
        System.out.println("you can leave the parking lot");
    }

    public void vehicleRegisterQuestion() {
        System.out.println("Do you want register your vehicle?");
    }

    public void registerMessage(String vehicleIdentification) {

        System.out.println("Your vehicle are register: " + vehicleIdentification);
    }

    public void writeVehicleRegistrationNumber() {
        System.out.print("Write your vehicle number (XX XXX): ");
    }

    public void registerErrorMessage() {
        System.out.println("You can't register your vehicle");
    }

    public void entryErrorMessage() {
        System.out.println("ALERT: You can't enter!");
    }

    public void exitErrorMessage() {
        System.out.println("ALERT: You can't exit!");
    }
}
