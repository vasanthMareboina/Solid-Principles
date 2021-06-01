package Parking;

import java.time.LocalDateTime;

public class FourWheelerParking implements Parking{
    private LocalDateTime parkingTime;

    void setParkingTime(LocalDateTime parkingTime){
        this.parkingTime = parkingTime;
    }

    public LocalDateTime getParkingTime() {
        return parkingTime;
    }

    void parkFourWheeler(FourWheeler fourWheeler){

    }

    @Override
    public void parkYourVehicle(Vehicle vehicle) {

    }
    void lockTheDoors(Vehicle vehicle){

    }
}
