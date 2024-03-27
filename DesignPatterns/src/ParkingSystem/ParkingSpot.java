package ParkingSystem;

public class ParkingSpot {

    private int parkingSpotId;
    private Vehicle vehicle;
    private int occupied;

    public ParkingSpot(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
        this.occupied = 0;
        this.vehicle = null;
    }
    
    public void occupy(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.occupied = 1;
    }
    
    public void vacateSpot() {
        this.vehicle = null;
        this.occupied = 0;
    }

    public boolean isOccupied() {
        return occupied==1;
    }
}
