package array.leason.four;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("java");
        names.add("ruby");
        names.add("java");

        System.out.println(names.contains("java"));
        System.out.println(names.contains("c#"));

        boolean removed = names.remove("java");//remove first occurrence
        System.out.println(removed);
        System.out.println(names.contains("java"));

        System.out.println(names.size());

        Object[] objects = names.toArray();//forever convert array object

        String[] objectsStrings = names.toArray(new String[names.size()]);//specific return array method one
        String[] objectsStrings2 = names.toArray(new String[0]);//specific return array method two


        ArrayList<String> country = new ArrayList<>();
        country.add("Brazil");
        country.add("Coreia");


        ArrayList<String> all = new ArrayList<>();
        all.addAll(names);
        all.addAll(country);//last add

        System.out.println(all.size());

        System.out.println(names.get(0));
        names.add(0,"php");
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        names.remove(0);
        System.out.println(names.get(0));

        names.set(0, "scala");
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        System.out.println(names.indexOf("java"));
        System.out.println(names.lastIndexOf("java"));

        System.out.println(names.indexOf("c#"));
        System.out.println(names.lastIndexOf("c#"));

        //names.set(90, "scala"); outbound

    }
}

