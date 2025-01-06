import java.util.ArrayList;

class MachineForGenericsWildcards {

    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine starting.");
    }

}

class CameraForGenericsWildcards extends MachineForGenericsWildcards {
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("snap!");
    }
}

public class GenericsWildcards {

    public static void main(String[] args) {

        ArrayList<MachineForGenericsWildcards> list1 = new ArrayList<MachineForGenericsWildcards>();

        list1.add(new MachineForGenericsWildcards());
        list1.add(new MachineForGenericsWildcards());

        ArrayList<CameraForGenericsWildcards> list2 = new ArrayList<CameraForGenericsWildcards>();

        list2.add(new CameraForGenericsWildcards());
        list2.add(new CameraForGenericsWildcards());

        showList(list2);
        showList2(list1);
        showList3(list1);
    }

    public static void showList(ArrayList<? extends MachineForGenericsWildcards> list) {
        for (MachineForGenericsWildcards value : list) {
            System.out.println(value);
            value.start();
        }

    }

    public static void showList2(ArrayList<? super CameraForGenericsWildcards> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }


}