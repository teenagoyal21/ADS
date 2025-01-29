public class oops {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(1.1f, 2.9f);
        
    }
}

class Calculator{
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(float a, float b){
        System.out.println(a+b);
    }
}

class Student{
    public void study(){
        System.out.println("studing");
    }
}

class NonMed extends Student {
    @Override
    public void study(){
        System.out.println("studing science");
    }
}