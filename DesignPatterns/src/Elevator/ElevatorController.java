package Elevator;

import Elevator.Models.Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private static ElevatorController instance;
    private List<Elevator> elevators;

    private ElevatorController() {
        this.elevators = new ArrayList<>();
    }

    public static ElevatorController getInstance() {
        if (instance == null) {
            instance = new ElevatorController();
        }
        return instance;
    }

    public void addElevator(Elevator elevator) {
        this.elevators.add(elevator);
    }

    public void requestElevator(int floor) {
        // Logic to assign the nearest elevator to the requested floor
    }

    // Other methods
}
