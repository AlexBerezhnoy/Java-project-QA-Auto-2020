package Lec8.sub;

import java.util.Objects;

public class Pet {

    private int id;
    private String name;
    private String type;
    private String visitDate;

    public Pet (int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId (){return id;}

    public String getName () {return name;}

    public String getType () {return type;}

    public String getVisitDate() {return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString () {
        return "Pet [id = "+ id+", name= "+name+", type = "+ type +" ]";
    }

//    @Override
//    public boolean equals (Object object) {
//        if (object == null) {
//            return false;
//        }
//        if (object instanceof Pet) {
//            Pet pet = (Pet) object;
//            return pet.id == this.id && pet.name.equals(this.name) && pet.type.equals(this.type);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id &&
                Objects.equals(name, pet.name) &&
                Objects.equals(type, pet.type) &&
                Objects.equals(visitDate, pet.visitDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, visitDate);
    }
}
