package practice_oop;

  public class A {

     public A(int d) {    //burda gorunur bir constructor varsa alt siniftada olusturulmak zorundadir


         this.a = a;
     }

    static int a=5;
    protected   void sound(){
        System.out.println("kedi sesi");
    }


}

class B extends A {


    int b=6;

    public  B() {
        super(5);    //ilk sirada olmasi gerekli

        System.out.println();

        System.out.println(super.a);


    }


   public void method(){

   }

    protected void sound(){


        System.out.println("inek sesi");

    }


}

class test{
    public static void main(String[] args) {
        A obj=new B();
        System.out.println(obj.a);    //5
        obj.sound();


    }
}
