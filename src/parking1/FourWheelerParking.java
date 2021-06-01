package parking1;

import java.time.LocalDateTime;

public class FourWheelerParking implements Parking {
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


    void displayParkingInformation(FourWheelerParking fourWheelerParking){
        LocalDateTime time= fourWheelerParking.getParkingTime();
        System.out.println("Parked on "+time.getDayOfMonth()+" and the time is "+time.getHour() +" "+time.getMinute()+" "+time.getSecond());
    }
}
