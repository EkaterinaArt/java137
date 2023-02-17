package lesson3;

public class Person {
    public String name ;
    public String lastname;

    public int age;
    private int hp;



    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
        this.hp=100;
    }
    int getHp(){
        return this.hp;
    }
    void setHp(int hp){
        if(this.hp+hp>100)this.hp=100;
        else this.hp = this.hp+hp;
        this.hp = this.hp+hp;
    }
    Person mother;
    Person father;


    void sayHi(String name){
        System.out.println("Привет меня зовут " + this.name);}

        public String info(){
            String result = "Меня зовут "+ this.name+"\n"+
                    "Мне " +this.age + "лет\n" +

                    "Мою маму зовут: "+ this.mother.name+"\n"+
                    "Моего папу зовут: "+ this.father.name;
            if(this.mother != null){
                result = result + "Мою маму зовут: "+ this.mother.name +"\n";
            }
            if(this.father!=null){
                result = result + "Мою папу зовут: "+ this.father.name +"\n";
            }
            return result;

        }
    }

