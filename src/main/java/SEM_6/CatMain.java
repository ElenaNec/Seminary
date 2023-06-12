package SEM_6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat(Bread.PERS, LocalDate.now(), new Owner(), new Pedigree(), Color.BLACK, Gender.FEMALE);
        Bread bread = cat.getBread();
        System.out.println(bread);
        Cat cat2 = new Cat(Bread.PERS, LocalDate.now(), new Owner(), new Pedigree(), Color.BLACK, Gender.FEMALE);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        System.out.println(cats);
        cat.eat();
        cat.eat(5);
    }
}
