class ClassForToStringDemoFrog {

    private int id;
    private String name;

    public ClassForToStringDemoFrog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%-4d: %s", id, name);
         
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
         
        return sb.toString();
        */
    }
}

public class ToString {

    public static void main(String[] args) {
        ClassForToStringDemoFrog frog1 = new ClassForToStringDemoFrog(7, "Freddy");
        ClassForToStringDemoFrog frog2 = new ClassForToStringDemoFrog(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}