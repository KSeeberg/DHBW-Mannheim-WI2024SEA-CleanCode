package solid.dip.exercise;

public class BasicPowerSource implements PowerSource {
	@Override
    public void charge() {
        System.out.println("Charging...");
    }
   
    @Override
    public String toString() {
        return "Basic Power Source";
    }
}
