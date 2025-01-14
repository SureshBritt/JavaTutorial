import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class PersonForNaturalOrdering implements Comparable<PersonForNaturalOrdering> {
    private String name;

    public PersonForNaturalOrdering(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        final PersonForNaturalOrdering other = (PersonForNaturalOrdering) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(PersonForNaturalOrdering PersonForNaturalOrdering) {
        int len1 = name.length();
        int len2 = PersonForNaturalOrdering.name.length();

        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(PersonForNaturalOrdering.name);
        }
    }
}

public class NaturalOrderingExample {

    public static void main(String[] args) {
        List<PersonForNaturalOrdering> list = new ArrayList<PersonForNaturalOrdering>();
        SortedSet<PersonForNaturalOrdering> set = new TreeSet<PersonForNaturalOrdering>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    private static void addElements(Collection<PersonForNaturalOrdering> col) {
        col.add(new PersonForNaturalOrdering("Joe"));
        col.add(new PersonForNaturalOrdering("Sue"));
        col.add(new PersonForNaturalOrdering("Juliet"));
        col.add(new PersonForNaturalOrdering("Clare"));
        col.add(new PersonForNaturalOrdering("Mike"));
    }

    private static void showElements(Collection<PersonForNaturalOrdering> col) {
        for(PersonForNaturalOrdering element: col) {
            System.out.println(element);
        }
    }

}
