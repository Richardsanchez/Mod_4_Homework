/**
 * Created by richarddev on 3/7/17.
 */
import java.util.*;

public class ShuffleArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }

}
