package JAVA12_OOPs.JAVA05_Inheritence;

//
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }


    public BoxWeight(double l, double h, double w, double weight){

        // Super Keyword
        super(l,w,h);   // call the parent class constructor
        // Used to initialise values present in parent class

        this.weight = weight;
    }
}
