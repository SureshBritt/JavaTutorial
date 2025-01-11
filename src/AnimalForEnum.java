public enum AnimalForEnum {
    CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
     
    private String name;

    AnimalForEnum(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
     
    public String toString() {
        return "This animal is called: " + name;
    }
}