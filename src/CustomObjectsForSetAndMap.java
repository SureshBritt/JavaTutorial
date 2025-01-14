import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class PersonForCustom {
    private int id;
    private String name;

    public PersonForCustom(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PersonForCustom other = (PersonForCustom) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}


public class CustomObjectsForSetAndMap {

    public static void main(String[] args) {

        PersonForCustom p1 = new PersonForCustom(0, "Bob");
        PersonForCustom p2 = new PersonForCustom(1, "Sue");
        PersonForCustom p3 = new PersonForCustom(2, "Mike");
        PersonForCustom p4 = new PersonForCustom(1, "Sue");

        Map<PersonForCustom, Integer> map = new LinkedHashMap<PersonForCustom, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for(PersonForCustom key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<PersonForCustom> set = new LinkedHashSet<PersonForCustom>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }

}