/* This is the inheritance class
 in this you will be seeing different functions
 such as code reusability
  function overriding
  and the of super keyword */
class inheritance{

    public inheritance(){
        System.out.println("Hello i am inside the inheritance constructor " +
                "To show more out of it lets roll inside the program");
    }
    public void methodName(){
        System.out.println("The name of this method is 'methodName' ");
    }
    public void metionDetailsOfsubclass(){
        System.out.println("The sub class of the class inheritance is override");
    }
}
class override extends inheritance {

    override() {
        super();
        System.out.println("I am inside the override constructor " +
                "method overriding is the very useful concept or function of inheritance ");
    }

    @Override
    public void methodName() {
        super.methodName();
        System.out.println("You are inside the method, 'methodName of class override' ");
    }
    @Override
    public void metionDetailsOfsubclass(){
        super.metionDetailsOfsubclass();
        System.out.println("Hello i am inside the sub class" +
                "also i am the extended version of my super class 'inheritance' ");
    }
}

class polymorphism extends inheritance{
    public polymorphism(){
        super();
        System.out.println("I am inside the class polymorphism " +
                "which is also an extended class of inheritance");
    }
    public void summ(){
        int a = 90;
        int b = 78;
        int s = a + b;
        System.out.println("The sum of the following is " + s);
    }
    public void summ(int a , int b){
        int s = a + b;
        System.out.println("Sum of the given values are " + s);
    }
    @Override
    public void metionDetailsOfsubclass(){
        super.metionDetailsOfsubclass();
        System.out.println(" I am the polymorphism class which is the sub class inheritance");
    }

}
class encapsiculation extends inheritance{
    private String name = "Inheritance";
    encapsiculation(){
        System.out.println("Hello i am inside the constructor class of encapsulation");
    }
    public String toString(){
        return this.name;
    }
    public void setName(String newName){
        System.out.println("Hence the new name is " + newName);
    }
}
abstract class Animal{
    abstract void classification();

}
class Tpyess extends Animal{
    public void classification(){
        System.out.println("Domestic");
        System.out.println("Wild");
    }
}
class domestic extends Animal{
    public void classification(){
        String[] a = {"cow", "buffalo", "hen", "goat", "sheep"};
        for (String animmals: a
             ) {
            System.out.println(animmals);
        }
    }
}
class wild extends Animal{
    public void classification(){
        String[] b = {"Tiger", "Lion", "Wilder_Beast", "Wolf", "Jackal", "Reindeer"};
        for (String wildAnimals : b
             ) {
            System.out.println(wildAnimals);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        override obj1 = new override();
        obj1.methodName();
        obj1.metionDetailsOfsubclass();
        polymorphism obj2 = new polymorphism();
        obj2.summ();
        obj2.summ(23, 34);
        encapsiculation obj3 = new encapsiculation();
        obj3.toString();
        obj3.setName("OOPS DEMONSTRATION BY ME");
        Tpyess typ = new Tpyess();
        typ.classification();
        domestic dom = new domestic();
        dom.classification();
        wild wi = new wild();
        wi.classification();
    }
}
