class MachineForAnonymous {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface PlantForAnonymous {
    public void grow();
}

public class AnonymousClassExample {

    public static void main(String[] args) {

        // This is equivalent to creating a class that "extends"
        // Machine and overrides the start method.
        MachineForAnonymous machine1 = new MachineForAnonymous() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        };

        machine1.start();

        // This is equivalent to creating a class that "implements"
        // the Plant interface
        PlantForAnonymous plant1 = new PlantForAnonymous() {
            @Override
            public void grow() {
                System.out.println("Plant growing");

            }
        };

        plant1.grow();
    }
}