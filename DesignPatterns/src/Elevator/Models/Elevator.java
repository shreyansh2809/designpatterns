package Elevator.Models;

import Elevator.Enums.Direction;
import Elevator.Enums.Status;
import Elevator.Models.Door;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int elevatorId;
    private int currentFloor;
    private Direction direction;
    private Status status;
    private List<Integer> requests;
    private final int numFloors;
    private Door doors;

    public Elevator(int elevatorId, int numFloors) {
        this.elevatorId = elevatorId;
        this.currentFloor = 1; // Default starting floor
        this.direction = null; // Direction of movement (UP, DOWN, null)
        this.status = Status.IDLE; // Status of the elevator (IDLE, MOVING, STOPPED)
        this.requests = new ArrayList<>(); // List of floor requests
        this.numFloors = numFloors;
        this.doors = new Door(); // Each elevator has doors
    }

    public void move(Direction direction) {
        this.direction = direction;
        this.status = Status.MOVING;
        // Move the elevator based on the direction
        if (direction == Direction.UP) {
            this.currentFloor++;
        } else if (direction == Direction.DOWN) {
            this.currentFloor--;
        }
    }

    public void stop() {
        this.status = Status.STOPPED;
    }

    public void addRequest(int floor) {
        this.requests.add(floor);
    }

    // Other getter and setter methods
}