package april;

public class ball {
    String material;
    String color;
    double price;

    public ball(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ball [color=" + color + ", material=" + material + ", price=" + price + "]";
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    class meow {
        public static void main(String[] args) {
            ball b = new ball("Leather", "Red", 100);
            ball b1 = new ball("Jumper", "Yellow", 20);
    
            b.setMaterial("Metal");
    
            System.out.println(b);
            System.out.println(b1);
       }   }
}
