package oopLec;

public class dog {

    public String name;
    public String breed;
    public boolean canBreed;
    public int age;

    public void callForDog(String name) {
        if (name.equalsIgnoreCase(this.name)){
            System.out.println(this.name + " is now walking toward you!");
        } else {
            System.out.println(this.name + " ignores you.");
        }
    }

}
