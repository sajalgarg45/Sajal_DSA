package JAVA12_OOPs.JAVA05_Inheritence;

public class Main {
    public static void main(String[] args) {

//        JAVA01_Box box = new JAVA01_Box(4);
//        System.out.println(box.l+ " "+box.w+ " "+box.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println(box3.h+" "+box3.weight);

        Box box5 = new BoxWeight(2,3,4,5);
        System.out.println(box5);

        // there are many variables in both parent and child classes
        // we are given access to variables that are in the ref types i.e. BoxWeight
        // hence you should have access to weight variable
        // this also means that the ones you are trying to access should be initialed
        // but here when the object itself is of type parent class, how will you call the constructor of child class?

//        BoxWeight box6 = new Box(2,3,4);
//        System.out.println(box6);
    }
}

/*
study the flow of constructor in inheritance
 */