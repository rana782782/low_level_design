package strategy_design.withStrategy;

public class Vehicle {
     DriverStrategy driverStrategy;

    Vehicle(DriverStrategy obj){
        this.driverStrategy = obj;
    }

    public void drive(){
        driverStrategy.drive();
    }
}
