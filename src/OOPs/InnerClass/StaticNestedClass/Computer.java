package OOPs.InnerClass.StaticNestedClass;

// Static Nested Inner Class : static class declared inside another class
// it cannot directly access non-static members of the outer class.
//it can be created without creating a Computer object

public class Computer {

    private String model;

    private String brand;

    private OperatingSystem os;

    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public Computer(String model, String brand, String osName) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {

        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void info() {
            System.out.println("Computer model :" + model + " Operating System :" + osName);
        }

    }
}