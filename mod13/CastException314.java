package academy.kata.educational_process.core1.mod13;

public class CastException314 {
    public static void main(String[] args) {
        B b = new B();
        A a = (A) b;
        System.out.println("Приведение к другому типу: ");
    }

    public static class A {
    }

    public static class B extends A{
    }
}
