package april;

public class Car {
    String model;
    String company;
    String number;
    String color;
    @Override
    public String toString() {
        return "Car [color=" + color + ", company=" + company + ", milage=" + milage + ", model=" + model + ", number="
                + number + ", price=" + price + "]";
    }
    double price;
    double milage;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getMilage() {
        return milage;
    }
    public void setMilage(double milage) {
        this.milage = milage;
    }
    public Car(String model, String company, String number, String color, double price, double milage) {
        this.model = model;
        this.company = company;
        this.number = number;
        this.color = color;
        this.price = price;
        this.milage = milage;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Creta", "Hundai", "AP39JL0999", "White", 1050000, 17);

        System.out.println(c1);
        Car c2 = new Car("punch", "TATA", "AP39JL1234", "White", 1052222, 19);
    
        System.out.println(c2);
    }

    
}
