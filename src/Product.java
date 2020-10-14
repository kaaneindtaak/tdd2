import java.util.ArrayList;

public class Product {
    private String name;
    private Integer size;
    private Double percentage;

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String productDescription() {
        if (size == null && percentage == null) return "";
        String result = " • ";
        if (size != null) result += size + "CL";
        if (size != null && percentage != null) result += " ";
        if (percentage != null) {
            String format = (percentage % 1 == 0) ? "%.0f%%" : "%.1f%%";
            result += String.format(format, percentage);
        }
        return result;
    }
}