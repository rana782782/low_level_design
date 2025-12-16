package strategy_design.withStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDriveCap());
    }
}
