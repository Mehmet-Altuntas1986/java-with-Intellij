package practice_oop;

public enum Level {
    BIG,SMALL;

    Level(int a) {
        this.a = a;
    }



    int a=5;

    Level() {

    }


    public static void Method(){
        System.out.println("enum");
    }

    public static void main(String[] args) {
        Level.Method();
        Level lv= Level.BIG;
        System.out.println(lv.a);

    }
}
