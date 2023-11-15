
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        System.out.println(humans);


        Collections.sort(humans);
        System.out.println(humans);

        Human firstHuman = new Human("h1", 10000);
        Human secondHuman = new Human("h2", 5000);
        Human thirdHuman = new Human("h3", 6000);

        System.out.println(firstHuman.compareTo(secondHuman));
        System.out.println(secondHuman.compareTo(thirdHuman));
        System.out.println(firstHuman.compareTo(thirdHuman));
    }
}
