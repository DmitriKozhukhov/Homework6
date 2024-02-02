public class Notebook {
    private String model;
    private String os;
    private String color;
    private double displaySize;
    private String cpuType;
    private double cpuSpeed;
    private int memory;
    private String storageType;
    private int storageSize;

    public Notebook(String model, String os, String color, double displaySize,
                    String cpuType, double cpuSpeed, int memory, String storageType, int storageSize) {
        this.model = model;
        this.os = os;
        this.color = color;
        this.displaySize = displaySize;
        this.cpuType = cpuType;
        this.cpuSpeed = cpuSpeed;
        this.memory = memory;
        this.storageType = storageType;
        this.storageSize = storageSize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", OS='" + os + '\'' +
                ", color='" + color + '\'' +
                ", displaySize=" + displaySize +
                ", cpuType='" + cpuType + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", memory=" + memory +
                ", storageType='" + storageType + '\'' +
                ", storageSize=" + storageSize +
                '}';
    }
}
