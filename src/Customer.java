class Customer implements DiscountRate {
    String name;
    String type;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setCustomerType(String type) {
        this.type = type;
    }

    @Override
    public double getServiceDiscountRate(String type) {
        if (type.equalsIgnoreCase("premium")) {
            return 0.20;
        } else if (type.equalsIgnoreCase("gold")) {
            return 0.15;
        } else if (type.equalsIgnoreCase("silver")) {
            return 0.10;
        } else {
            return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        if (type.equalsIgnoreCase("premium") || type.equalsIgnoreCase("gold") || type.equalsIgnoreCase("silver")) {
            return 0.10;
        } else {
            return 0.0;
        }
    }
}