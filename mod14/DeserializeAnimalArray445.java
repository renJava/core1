package academy.kata.educational_process.core1.mod14;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
 * Массив байт устроен следующим образом. Сначала идет число типа int, записанное при помощи
 * ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество объектов типа Animal,
 * сериализованных при помощи ObjectOutputStream.writeObject(animal).
 *
 * Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить
 * исключение java.lang.IllegalArgumentException.
 *
 * Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите,
 * какие исключения будут возникать. Вот их-то и нужно превратить в IllegalArgumentException и выбросить.
 * Если что-то забудете, то проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять
 * нигде пустой catch.
 */
public class DeserializeAnimalArray445 {
        //Твой код здесь
        public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException {
            try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
                int size = ois.readInt();
                Animal[] animals = new Animal[size];
                for (int i = 0; i < size; i++) {
                    animals[i] = (Animal) ois.readObject();
                }
                return animals;
            } catch (NegativeArraySizeException | IOException | ClassNotFoundException | ClassCastException e) {
                throw new IllegalArgumentException(e);
            }
        }


    public static void main(String[] args) {
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));

    }

    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
}
