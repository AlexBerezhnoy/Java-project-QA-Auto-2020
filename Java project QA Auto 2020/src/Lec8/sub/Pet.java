package Lec8.sub;

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

    public String toString () {
        return "Pet [id = "+ id+", name= "+name+" ]";
    }
}
