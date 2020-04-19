package Lec14;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
    private int id;
    private String name;

    public Fruit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return id == fruit.id &&
                Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public int compareTo(Fruit fruit) {
        if (this.name.length()> fruit.name.length() ) {return 1;}
        else if (this.name.length()< fruit.name.length()) {return -1;}
        else {return 0;}

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
