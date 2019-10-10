public class Person {
    public String name;
    public Mobile mobile;

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public void changePhone(Mobile mobile){
        this.mobile = mobile;
    }
}
