package src.main.oops.classobjects;

 class CODemo2 {

    int y;

     public CODemo2(int y) {
         this.y = y;
     }

     public CODemo2() {
         this.y = 7;
     }

     public int sum(int x, int y) {
         return x + y;
     }

     public static void main(String[] args) {

         CODemo2 coDemo2 = new CODemo2(6);
         int result = coDemo2.sum(56,77);

         System.out.println(result);

    }
}


/*

 In this class we have two constructors.


The user-defined parameterless constructor is always initializing the instance variable y with the value 7,
but the parameterized constructor can initialize the instance variable with any integer value that we supply.

Constructors' names are same as their class names. The class CODemo2 has multiple constructors.
So, it is an example of constructor overloading.

This class can have either variables or methods or both. In this class we have one method.
This method is used to accept two integer inputs, and in turn, it will return the sum of those integers.
* */