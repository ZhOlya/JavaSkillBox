import java.util.ArrayList;

public class Iterator {
    ArrayList<String> colors = new ArrayList<>();
       colors.add("Red");
       colors.add("Blue");
       colors.add("Pink");
       colors.add("Black");

    java.util.Iterator<String> iter = colors.iterator();
       while (iter.hasNext()){
        String color = iter.next();
        System.out.println(color);
        if (color.equals("Pink")){
            iter.remove();
        }
    }


        System.out.println("AFTER REMOVE");
       for (String color : colors){
        System.out.println(color);
    }
}
