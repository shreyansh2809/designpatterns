package Elevator.Models;

import Elevator.ElevatorController;

public class Floor {
    private int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void pressButton(int destinationFloor) {
        // Logic to request an elevator to the destination floor
        ElevatorController.getInstance().requestElevator(destinationFloor);
    }
}

