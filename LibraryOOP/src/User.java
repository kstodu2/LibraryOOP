public class User {
    private String firstName;
    private String lastName;
    private String fullName;
    private int age;

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " +lastName;
        this.age = age;
    }

    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }
}
