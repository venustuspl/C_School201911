public class Employee {
    private String name;
    private String surname;
    private double slary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 4) {
            Character.toUpperCase(name.charAt(0));
        this.name = name;
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSlary() {
        return slary;
    }

    public double getYearSlary() {
        return slary * 12;
    }

    public void setSlary(double slary) {
        this.slary = slary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
