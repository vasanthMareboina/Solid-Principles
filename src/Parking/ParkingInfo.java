package Parking;

import java.time.LocalDateTime;

public class ParkingInfo {
    void displayParkingInformation(FourWheelerParking fourWheelerParking){
        LocalDateTime time= fourWheelerParking.getParkingTime();
        System.out.println("Parked on "+time.getDayOfMonth()+" and the time is "+time.getHour() +" "+time.getMinute()+" "+time.getSecond());
    }
}
