public class Staff extends Person {
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        String staff = "Staff[Person[Name: " + name + ", Address: " + address + "], School: " + school + ", Pay: " + pay + "]";
        return staff;
    }
}
