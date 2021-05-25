package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {

     /*   Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/

        //3. tworzę obiekt klasy wewnętrznej
        Person.PersonBuilder builder = new Person.PersonBuilder("Anna Markowska",
                "a.markowska22", "Wojska Polskiego 2");
        builder.withPhone(945456756);
        builder.bornIn(LocalDate.now().minusYears(20));
        Person person = builder.build();
        System.out.println(person);
    }
}
