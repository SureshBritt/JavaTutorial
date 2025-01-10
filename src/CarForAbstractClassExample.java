public class CarForAbstractClassExample extends MachineForabstractClassExample {

    @Override
    public void start() {
        System.out.println("Starting ignition...");

    }

    @Override
    public void doStuff() {
        System.out.println("Driving...");
    }

    @Override
    public void shutdown() {
        System.out.println("Switch off ignition.");

    }

}