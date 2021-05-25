package creational.builder;
import java.time.LocalDate;
import java.util.Objects;

public class Person {

    //obowiazkowe
    private String fullName;
    private String mail;
    private String address;
    //opcjonalne
    private LocalDate birthDate;
    private int phone;

    //1. zostawić tylko pusty prywatny konstruktor
    private Person() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //2. wewnetrzna klasa statyczna
  static  class PersonBuilder{

        //4. tworzymy obiekt budowany w polu klasy buildera
        private Person person = new Person();

        //5. przygotowujemy konstruktor buildera zbierający niezbędne informacje
        public PersonBuilder(String fullName, String mail, String address) {
            person.fullName = fullName;
            person.mail = mail;
            person.address = address;
        }

        //6. ustawianie opcjonalnych pól obiektu za pomocą specyficznych setterów
        public PersonBuilder bornIn(LocalDate birthDate){
            person.birthDate = birthDate;
            return this;
        }

        public PersonBuilder withPhone(int phone){
            person.phone = phone;
            return this;
        }

        //7. oddajemy budowany obiekt
        public Person build() {
            return person;
        }

        //8. Poprawić nazwy metod
        //9. metody pośrednie zwracają builder

    }

}
