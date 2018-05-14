package beyond.leason.four;

import methods.leason.seven.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class People{
    String name;
    int years;
    People(String name, int years){
        this.name = name;
        this.years = years;
    }

    public String toString(){
        return name;
    }
}

interface Matcher<T>{
    boolean test(T t);
}

class MoreAges implements Matcher<People>{
    public boolean test(People p ){
        return p.years >= 18;
    }
}

class FilterPeople{
    List<People> filter(List<People> all, Matcher<People> matcher){
        List<People> result = new ArrayList<>();
        for (People p : all){
            if(matcher.test(p))
                result.add(p);
        }
        return result;
    }
}

public class TestLambda {
    public static void main(String[] args) {
        List<People> peoples = Arrays.asList(
                new People("Arthur", 29),
                new People("Steh", 27),
                new People("Fritz", 32),
                new People("Franklin", 43),
                new People("Pedro", 15),
                new People("Maria", 15)
        );
        FilterPeople fp = new FilterPeople();
        Matcher<People> criterio = new MoreAges();

        Matcher<People> criterio2 = new Matcher<People>() {
            public boolean test(People people) {
                return people.years >= 18;
            }
        };

        Predicate<People> predicate = new Predicate<People>() {//predicate in Java 1.8, override interface Matcher
            @Override
            public boolean test(People people) {
                return people.years >= 18;
            }
        };

        List<People> result = fp.filter(peoples, criterio);
        System.out.println(result);

        //Lambda (parameters) -> { code }
        Matcher<People> criterio3 = ( People p ) -> { return p.years >= 18; };
        Predicate<People> criterio4 = ( People p ) -> { return p.years >= 18; };
        Matcher<People> criterio5 = ( p ) -> { return p.years >= 18; };
        Predicate<People> criterio6 =  p -> { return p.years >= 18; };
        Matcher<People> criterio7 =  p ->  p.years >= 18 ;

        List<People> result2 = fp.filter(peoples, criterio7);
        System.out.println(result2);

        List<People> result3 = fp.filter(peoples, p ->  p.years >= 18);
        System.out.println(result3);

        List<People> result4 = fp.filter(peoples, p ->  p.name.startsWith("A"));
        System.out.println(result4);

        //Rules
        //(String s1, String s2) -> { code };
        //(s1, s2) -> { code };
        //p -> {code}
        //Runnable r = () ->{code};
        //Runnable r = () -> System.out.println("mg1");
        //Runnable r1 = () -> {System.out.println("mg1");
        //                     System.out.println("mg2");
        //                    };


    }
}
