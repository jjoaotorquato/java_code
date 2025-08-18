package company;

public class Manager extends Employee{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + bonus + " totalSalary: " + getSalary();
    }
}
