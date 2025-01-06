public class InterfaceExample {
    public static void main(String[] args) {

        MachineForInterfaceExample mach1 = new MachineForInterfaceExample();
        mach1.start();

        PersonForInterfaceExample person1 = new PersonForInterfaceExample("Bob");
        person1.greet();

        Info info1 = new MachineForInterfaceExample();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }

}
