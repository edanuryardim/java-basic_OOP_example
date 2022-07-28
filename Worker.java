public class Worker extends Person{
    String office;
    int salary;


    public Worker(String name, String address, String phoneNumber, String email,String office,int salary) {
        super(name, address, phoneNumber, email);
        this.office=office;
        this.salary=salary;
        // TODO Auto-generated constructor stub
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker [office=" + office + ", salary=" + salary + ", toString()=" + super.toString() + "]";
    }

}
