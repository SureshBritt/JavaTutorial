class MachineForcastingExample {
    public void start() {
        System.out.println("Machine started.");
    }
}

class CameraForCastingExample extends MachineForcastingExample {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}


public class Casting {
    public static void main(String[] args) {

        MachineForcastingExample machine1 = new MachineForcastingExample();
        CameraForCastingExample camera1 = new CameraForCastingExample();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting 
        MachineForcastingExample machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        // Downcasting
        MachineForcastingExample machine3 = new CameraForCastingExample();
        CameraForCastingExample camera2 = (CameraForCastingExample)machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work --- runtime error.
        MachineForcastingExample machine4 = new MachineForcastingExample();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
    }

}