package academy.kata.educational_process.core1.mod12;

public class CatchCat216 {
    // Твой код здесь

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }
        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }

    public static void main(String[]args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.catchCat(cat);
    }

}