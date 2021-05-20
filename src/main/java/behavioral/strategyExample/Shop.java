package behavioral.strategyExample;

class Shop {

    private double product = 9.99;
    private  TaxApplier taxApplier;

    Shop() {
        taxApplier = new TaxApplierSpain();
    }

    public void countPrice() {
        double totalPrice = taxApplier.applyTax(product);

       /* double totalPrice = product;
        if (country.equals("Hiszpania")) {
            totalPrice = totalPrice * 1.19;
        }else if(country.equals("Portugalia")){
            totalPrice = totalPrice *1.20;
        }*/
        System.out.println("Cena produktu: " + totalPrice + " zł");
    }

    void setTaxApplier(TaxApplier taxApplier) {
        this.taxApplier = taxApplier;
    }
}


class Demo{
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setTaxApplier(new TaxApplierSpain());
        shop.countPrice();
        shop.setTaxApplier(new TaxApplierPortugal());
        shop.countPrice();
    }
}
