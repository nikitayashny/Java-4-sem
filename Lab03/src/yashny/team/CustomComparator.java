package yashny.team;

import java.util.Comparator;

public class CustomComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
