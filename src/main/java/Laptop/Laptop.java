package Laptop;

public class Laptop {
    private String brandName;
    private String modelName;
    private String color;
    private String cpu;
    private int ramSize;
    private int romSize;
    private double screenSize;
    private boolean hdd;
    private boolean touchScreen;

    public Laptop(String brandName, String modelName, String color, String cpu, int ramSize, int romSize,
                  double screenSize, boolean hdd, boolean touchScreen) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.color = color;
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.romSize = romSize;
        this.screenSize = screenSize;
        this.hdd = hdd;
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Бренд: " + brandName + "\n" +
                "Модель: " + modelName + "\n" +
                "Цвет: " + color + "\n" +
                "Процессор: " + cpu + "\n" +
                "Оперативная память: " + ramSize + "\n" +
                "Встроенный накопитель: " + romSize + "\n" +
                "Экран: " + screenSize + "\n" +
                "HDD: " + (hdd ? "Да" : "Нет") + "\n" +
                "Сенсорный экран: " + (touchScreen ? "Да" : "Нет") + "\n";
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getRomSize() {
        return romSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public boolean isHdd() {
        return hdd;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }
}
