import java.text.SimpleDateFormat;
import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private Boolean filled = Boolean.FALSE;
    private java.util.Date dateCreated = new Date();

    public GeometricObject() {
    }

    public GeometricObject(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss");
        return "created on " + dateFormat.format(dateCreated) + "\nColor: " + color + " and filled: " + filled;
    }
}
