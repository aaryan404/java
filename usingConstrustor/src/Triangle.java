//here we are creating a triangle class with its attributes and behaviours
public class Triangle {
    //we need to add the attributes and the behaviours of the class
    static int numOfSides = 3;
    double base;
    double height;
    double sideOne;
    double sideTwo;
    double sideThree;
    //creating a constructor in the class
    public Triangle(double base, double height, double sideOne, double sideTwo,
                    double sideThree){
        //using these inputs to assign the values to the attributes
        //activating attribute      //assigning the value , for now using the name of input
        this.base = base;
        this.height = height;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

    }
    public double findArea(){
        double areaOfTriangle = (this.base*this.height)/2;
        return areaOfTriangle;
    }

}
