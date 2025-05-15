package Tugas.Tugas_PBO.Tugas5.data;

public class Item {
    private String name;
    private String description;
    private String location;
    private String status;

    public Item(String name, String description, String location, String status ){
        this.name = name;
        this.description = description;
        this.location = location;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("| %-15s | %-25s | %-15s | %-10s |",
                name, description, location, status);
    }

}
