package DZ_SEM_6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (Set).
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет.
// Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - цвет
//2 - бренд

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class LapTop {
    private Brand brand;
    private Color color;
    public LapTop(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }


    public static void chooseAnAction(Set<LapTop> lapTops){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Фильтр по бренду - 1\nФильтр по цвету - 2\n");
        int e = scanner.nextInt();
        if (e == 1) {
            LapTop.filterForBrand(lapTops);
        }
        else if (e == 2) {
            LapTop.filterForColor(lapTops);
        }
        else throw new RuntimeException("Введите 1 или 2");
    }

    public static void filterForBrand(Set<LapTop> lapTops) {
        Set<LapTop> filterBrand = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для фильтрации по бренду LENOVA нажмите - 1" +
                "\nДля фильтрации по бренду HP нажмите - 2" +
                "\nДля фильтрации по бренду MACBook нажмите - 3\n");
        int e = scanner.nextInt();
        if (e == 1) {
            for (LapTop x : lapTops) {
                if (x.getBrand().equals(Brand.LENOVA)) {
                    System.out.println(x);
                }
            }
        }

        else if (e == 2) {
            for (LapTop x : lapTops) {
                if (x.getBrand().equals(Brand.HP)) {
                    System.out.println(x);
                }
            }
        }
        else if (e == 3) {
            for (LapTop x : lapTops) {
                if (x.getBrand().equals(Brand.MACBOOK)) {
                    System.out.println(x);
                }
            }
        }
        else {
            System.out.println("Введите число 1, 2 или 3");
            System.out.print("Для фильтрации по бренду LENOVA нажмите - 1\nДля фильтрации по бренду HP нажмите - 2\nДля фильтрации по бренду MACBook нажмите - 3\n");
        }

    }
    public static void filterForColor(Set<LapTop> lapTops) {
        Set<LapTop> filterBrand = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для фильтрации по цвету BLACK нажмите - 1" +
                "\nДля фильтрации по цвету WHITE нажмите - 2" +
                "\nДля фильтрации по цвету SILVER нажмите - 3\n");
        int e = scanner.nextInt();
        if (e == 1) {
            for (LapTop c : lapTops) {
                if (c.getColor().equals(Color.BLACK)) {
                    System.out.println(c);
                }
            }
        }

        else if (e == 2) {
            for (LapTop c : lapTops) {
                if (c.getColor().equals(Color.WHITE)) {
                    System.out.println(c);
                }
            }
        }
        else if (e == 3) {
            for (LapTop c : lapTops) {
                if (c.getColor().equals(Color.SILVER)) {
                    System.out.println(c);
                }
            }
        }
        else {
            System.out.println("Введите число 1, 2 или 3");
            System.out.print("Для фильтрации по цвету BLACK нажмите - 1" +
                    "\nДля фильтрации по цвету WHITE нажмите - 2" +
                    "\nДля фильтрации по цвету SILVER нажмите - 3\n");
        }
    }
    @Override
    public String toString() {
        return "LapTop{" +
                "brand=" + brand +
                ", color=" + color +
                '}';
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        LapTop note = (LapTop) obj;
        return brand.equals(brand) && note.color == this.color;

    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }
}
