package academy.kata.educational_process.core1.mod16.phone624;

import java.util.Comparator;
import java.util.stream.Stream;

public class Phone {

    private final String name;
    private final String company;
    private final int price;

    public Phone(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }


        public void main(String[] args) {

            Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                    new Phone("Pixel 2", "Google", 500),
                    new Phone("iPhone 8", "Apple", 450),
                    new Phone("Nokia 9", "HMD Global", 150),
                    new Phone("Galaxy S9", "Samsung", 300));

            phoneStream.sorted(new PhoneComparator())
                    .forEach(p -> System.out.printf("%s (%s) - %d \n",
                            p.getName(), p.getCompany(), p.getPrice()));

        }

    class PhoneComparator implements Comparator<Phone> {

        public int compare(Phone a, Phone b) {

            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }
}