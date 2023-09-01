public class Category {
    private static int lastTypeID = 1;

    private int typeID;
    private String typeName;
    private double interest;

    // Parameterized constructor
    public Category(String typeName, double interest) {
        this.typeID = lastTypeID++;
        this.typeName = typeName;
        this.interest = interest;
    }

    // Default constructor
    public Category() {
        this.typeID = lastTypeID++;
    }

    // Getters and setters
    public int getTypeID() {
        return typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Type ID: " + typeID +
                "\nType Name: " + typeName +
                "\nInterest: " + interest;
    }
