package revision_oop;

public class HourlyEmployee extends Employee implements Displayable {

    Double hourlyRate;
    int number_of_hours;




    @Override
    public double earning() {
        return number_of_hours * hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", number_of_hours=" + number_of_hours +
                '}';
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumber_of_hours() {
        return number_of_hours;
    }

    public void setNumber_of_hours(int number_of_hours) {
        this.number_of_hours = number_of_hours;
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
}

