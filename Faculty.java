public class Faculty extends Worker {

    int work_hour;
    int grade;

    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary,int work_hour,int grade) {
        super(name, address, phoneNumber, email, office, salary);
        this.work_hour=work_hour;
        this.grade=grade;

        // TODO Auto-generated constructor stub
    }

    public int getWork_hour() {
        return work_hour;
    }

    public void setWork_hour(int work_hour) {
        this.work_hour = work_hour;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Faculty [work-hour=" + work_hour + ", grade=" + grade + ", toString()=" + super.toString() + "]";
    }


}
