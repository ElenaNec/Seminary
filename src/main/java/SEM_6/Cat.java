package SEM_6;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

//        Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//        а) информационной системой ветеринарной клиники
//        б) архивом выставки котов
//        в) информационной системой Театра кошек Ю. Д. Куклачёва
//        Можно записать в текстовом виде, не обязательно реализовывать в java.
@Getter
public class Cat {
    Bread bread;
    LocalDate birthday;
    Owner owner;
    Pedigree pedigree;
    Color color;
    Gender gender;

    public Cat(Bread bread, LocalDate birthday, Owner owner, Pedigree pedigree, Color color, Gender gender) {
        this.bread = bread;
        this.birthday = birthday;
        this.owner = owner;
        this.pedigree = pedigree;
        this.color = color;
        this.gender = gender;
    }

    public void eat(){
        System.out.println("text");
    }
    public void eat(int weight){
        System.out.println("text2 " + weight);
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "bread=" + bread +
                ", birthday=" + birthday +
                ", owner=" + owner +
                ", pedigree=" + pedigree +
                ", color=" + color +
                ", gender=" + gender +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        Cat c = (Cat) obj;
//        if (c.getBread().equals(this.getBread())) &&
//        c.getBirthday().equals(this.getBirthday()) &&
//                c.getOwner().equals(this.getOwner()) &&
//                c.getPedigree().equals(this.getPedigree()) &&
//                c.getColor().equals(this.getColor()) &&
//                c.getGender().equals(this.getGender())){
//
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return bread == cat.bread && Objects.equals(birthday, cat.birthday) && color == cat.color && gender == cat.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, birthday, color, gender);
    }
}
