package JAVA12_OOPs.JAVA04_Static;

public class Main {
    public static void main(String[] args) {

        Human P1 = new Human(11,"P1",1000,false);
        Human P2 = new Human(22,"P2",2000,true);
        Human P3 = new Human(33,"P3",3000,false);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

    }

    static void fun(){
//        greeting();

        // you cannot access non-static stuff without referencing their instances in a static context
        // Hence here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        fun();
        System.out.println("hello World");
    }
}

/*
a static data can access static data
a non-static data can access both static and non-static data
static function doesn't need to create an object for themselves , as they can be called easily
we cannot use this keyword inside static methods , obviously this represent object that's why .

 */