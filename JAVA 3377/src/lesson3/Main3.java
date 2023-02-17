package lesson3;



public class Main3 {
    public static void main(String[] args) {
        Person person2 = new Person("Иван","Иванов", 55, null, null);

        Person person3 = new Person("Liza","Иванова", 44,null,null);


        Person person1 = new Person("Peter","Ivanov", 11, person3,person2);
        int medKit = 50;

//        System.out.println(person1.getHp());
//        person1.setHp(-30);
//        System.out.println(person1.getHp());
//        person1.setHp(medKit);
//        System.out.println(person1.getHp());
//

//        person1.mother = person3;
//        person1.father = person2;

        System.out.println(person1.info());





    }
}
