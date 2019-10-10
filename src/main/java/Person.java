public class Person {
    public String name;
    public Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
