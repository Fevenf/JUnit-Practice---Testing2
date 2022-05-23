package test;

public class Animal {
    private String name;
    private boolean dogOrNah;

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
        this.dogOrNah = true;
    }
    public Animal(boolean dogOrNah){
        this.dogOrNah = dogOrNah;
    }
    public Animal(String name, boolean dogOrNah) {
        this.name = name;
        this.dogOrNah = dogOrNah;
    }

    public String getName() {
        return name;
    }

    public Boolean getDogOrNah() {
        return dogOrNah;
    }
    public String toString() {
        return getName() + " is a dog: " + getDogOrNah();
    }

}