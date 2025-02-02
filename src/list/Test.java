package list;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Gaveshani");
        names.add("Upeksha");
        names.add("Nikethani");
        names.add("Nethma");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
