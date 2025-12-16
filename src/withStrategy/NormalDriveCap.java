package withStrategy;

public class NormalDriveCap implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capacity");
    }
}
