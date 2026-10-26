public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    // Empty no-arg constructor for Jackson
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}