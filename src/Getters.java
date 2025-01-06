class PersonForGetterExample {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}


public class Getters {

    public static void main(String[] args) {
        PersonForGetterExample PersonForGetterExample1 = new PersonForGetterExample();

        PersonForGetterExample1.name = "Joe";
        PersonForGetterExample1.age = 25;

        // PersonForGetterSetterExample1.speak();

        int years = PersonForGetterExample1.calculateYearsToRetirement();

        System.out.println("Years till retirements " + years);

        int age = PersonForGetterExample1.getAge();
        String name = PersonForGetterExample1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}