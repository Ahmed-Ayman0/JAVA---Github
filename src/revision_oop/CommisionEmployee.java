package revision_oop;

public class CommisionEmployee extends Employee implements Displayable{

    double Gross_sales;
    double commission_rate;

    public double getGross_sales() {
        return Gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        Gross_sales = gross_sales;
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" +
                "Gross_sales=" + Gross_sales +
                ", commission_rate=" + commission_rate +
                '}';
    }

    public double getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(double commission_rate) {
        this.commission_rate = commission_rate;
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());

    }

    @Override
    public void DisplayEarnings() {
        System.out.println(earning());
    }

    @Override
    public double earning() {
        return Gross_sales* commission_rate;
    }
}
