public class Staff extends Worker{
    String degree;

    public Staff(String name, String address, String phoneNumber, String email, String office, int salary,String degree) {
        super(name, address, phoneNumber, email, office, salary);
        this.degree=degree;
        // TODO Auto-generated constructor stub
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Staff [degree=" + degree + ", office=" + office + ", salary=" + salary + ", toString()=" + super.toString()
                + "]";
    }
}
