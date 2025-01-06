public class IneritanceExample {
    public static void main(String[] args) {
        MachineForInheritanceExample mach1 = new MachineForInheritanceExample();

        mach1.start();
        mach1.stop();

        CarForInheritanceExample car1 = new CarForInheritanceExample();

        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();


    }

}
