package withStrategy;

public class SportsDriveCap implements DriverStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capacity");
    }
}
