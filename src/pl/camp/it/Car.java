package pl.camp.it;

public class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Car o) {
        int brandComparison = this.brand.compareTo(o.brand);

        if(brandComparison == 0) {
            int modelComparison = this.model.compareTo(o.model);

            if(modelComparison == 0) {
                return Integer.compare(this.price, o.price);
            } else {
                return modelComparison;
            }
        } else {
            return brandComparison;
        }
    }
}
