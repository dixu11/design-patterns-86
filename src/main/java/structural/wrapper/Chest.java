package structural.wrapper;

class Chest {

    private String type;

    Chest(String type) {
        this.type = type;
    }

    public void openChest() {
        System.out.println("Znalazłeś " + type+ " skrzynię");
    }

}

//dziedziczę po obiekcie opakowywanym aby dostać jego typ
class Mimic extends Chest{

    private Chest chest;

    //wstawiam obiekt opakowywany aby "moje" zachowania udawały te jego
    Mimic(Chest chest) {
       super("");
        this.chest = chest;
    }

    @Override
    public void openChest() {
        chest.openChest();
        System.out.println("Skrzynia okazuje się być potworem wystawia zęby i zjada herosa");
    }
}


class Demo{
    public static void main(String[] args) {
        Chest chest = new Chest("srebrną");
        chest.openChest();
        Chest mimic = new Mimic(chest);
        mimic.openChest();
    }
}
