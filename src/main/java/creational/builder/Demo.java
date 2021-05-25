package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {

     /*   Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/

        //3. tworzę obiekt klasy wewnętrznej
      /*  Person person = new Person.PersonBuilder("Anna Markowska",
                "a.markowska22", "Wojska Polskiego 2")
                .withPhone(945456756)
                .bornIn(LocalDate.now().minusYears(20))
                .build();
        System.out.println(person);*/
        //10. używam fluent interface (jak przy streamach)

        //12. wykorzystanie statycznej metody
        Person person =   Person.builder("Anna Markowska",
                "a.markowska22", "Wojska Polskiego 2")
                .withPhone(945456756)
                .bornIn(LocalDate.now().minusYears(20))
                .build();

        System.out.println(person);
    }
}
