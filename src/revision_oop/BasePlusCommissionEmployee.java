package revision_oop;

public class BasePlusCommissionEmployee extends CommisionEmployee{

    double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double earning() {

        return base + super.earning();
    }

    @Override
    public void DisplayAllDetails() {
      super.DisplayAllDetails();
        DisplayEarnings(); // not understanding

    }

    @Override
    public void DisplayEarnings() {
        System.out.println("Earnings = "+earning());
    }
}
