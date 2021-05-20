package behavioral.strategyExample;

interface TaxApplier {
    double applyTax(double price);
}

class TaxApplierSpain implements TaxApplier{

    @Override
    public double applyTax(double price) {
        return price * 1.19;
    }
}

class TaxApplierPortugal implements TaxApplier{

    @Override
    public double applyTax(double price) {
        return price * 1.2;
    }
}
