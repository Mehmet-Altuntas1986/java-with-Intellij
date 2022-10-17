package day40_accessmodifiers_final;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();  //new keyword bir constructor cagirir
		
		mouse.getMouseDetails();

	}

}

/*
Variable hiding happens when we define a variable in a child class with the same name as one we defined in the parent class. 
A child class can declare a variable with the same name as an inherited variable from its parent class, thus hiding the inherited variable.

In other words, when the child and parent classes both have a variable with the same name, the child class' variable hides the parent class' variable.

In the following example, we are hiding the variable named x in the child class while it is already defined by its parent class.

1
class Child extends Parent {
2
​
3
    // Hiding the Parent class's variable `x` by defining a variable in the child class with the same name.
4
    String x = "Child`s Instance Variable";
5
​
6
    @Override
7
    public void printInstanceVariable() {
8
        System.out.print(x);
9
​
10
        // If we still want to access the variable from the super class, we do that by using `super.x`
11
        System.out.print(", " + super.x + "\n");
12
    }
13
}



#When an instance variable in a subclass has the same name as an instance variable in a super class,
 then the instance variable is chosen from the reference type.


public static void main(String[] args) throws Exception {

    Parent parent = new Parent();
    parent.printInstanceVariable(); // Output - "Parent's Instance Variable"
    System.out.println(parent.x); // Output - "Parent's Instance Variable"

    Child child = new Child();
    child.printInstanceVariable();// Output - "Child's Instance Variable, Parent's Instance Variable"
    System.out.println(child.x);// Output - "Child's Instance Variable"

    parent = child; // Or parent = new Child();
    parent.printInstanceVariable();// Output - "Child's Instance Variable, Parent's Instance Variable"
    System.out.println(parent.x);// Output - Parent's Instance Variable

    // Accessing child's variable from parent's reference by type casting
    System.out.println(((Child) parent).x);// Output - "Child's Instance Variable"
}



*/