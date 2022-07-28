public class Student extends Person{

    boolean istrue;

    public Student(String name, String address, String phoneNumber, String email,boolean istrue) {
        super(name, address, phoneNumber, email);
        this.istrue=istrue;
        // TODO Auto-generated constructor stub
    }

    public boolean isTrue() {
        return istrue;
    }

    public void setIse(boolean istrue) {
        this.istrue = istrue;
    }

    @Override
    public String toString() {
        return "Student [isTrue=" + istrue + ", toString()=" + super.toString() + "]";
    }
}
