package Elevator.Models;

import Elevator.Enums.DoorStatus;

public class Door {
    private DoorStatus status;

    public Door() {
        this.status = DoorStatus.CLOSED; // Default door status is closed
    }

    public void open() {
        this.status = DoorStatus.OPEN;
    }

    public void close() {
        this.status = DoorStatus.CLOSED;
    }

    // Other methods
}


