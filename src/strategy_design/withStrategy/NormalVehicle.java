package strategy_design.withStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDriveCap());
    }
}
