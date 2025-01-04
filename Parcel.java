// Parcel.java
public class Parcel {
    private String id;
    private double length;
    private double width;
    private double height;
    private double weight;
    private int daysInDepot;

    // Constructor
    public Parcel(String id, double length, double width, double height, double weight, int daysInDepot) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.daysInDepot = daysInDepot;
    }

    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDaysInDepot() {
        return daysInDepot;
    }

    public void setDaysInDepot(int daysInDepot) {
        this.daysInDepot = daysInDepot;
    }

    // Method to calculate fee (for example)
    public double calculateFee() {
        double fee = (weight * 0.5) + (length * width * height * 0.05) + (daysInDepot * 0.2);
        return fee;
    }
}
