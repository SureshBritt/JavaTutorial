public class EnumExample {

    public static void main(String[] args) {

        AnimalForEnum animal = AnimalForEnum.DOG;

        switch(animal) {
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                break;
            default:
                break;

        }

        System.out.println(AnimalForEnum.DOG);
        System.out.println("Enum name as a string: " + AnimalForEnum.DOG.name());

        System.out.println(AnimalForEnum.DOG.getClass());

        System.out.println(AnimalForEnum.DOG instanceof Enum);

        System.out.println(AnimalForEnum.MOUSE.getName());

        AnimalForEnum animal2 = AnimalForEnum.valueOf("CAT");

        System.out.println(animal2);
    }

}