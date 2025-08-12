package excercises.chapter_11;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Konstruktor für ein Standard-GeometricObject */
    public GeometricObject() {
        this.dateCreated = new Date();
    }

    /** Konstruktor für ein GeometricObject mit spezifischer Farbe und Füllung */
    public GeometricObject(String color, boolean filled) {
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /** Gibt die Farbe zurück */
    public String getColor() {
        return color;
    }

    /** Setzt eine neue Farbe */
    public void setColor(String color) {
        this.color = color;
    }

    /** Gibt den Füllstatus zurück (true/false) */
    public boolean isFilled() {
        return filled;
    }

    /** Setzt einen neuen Füllstatus */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Gibt das Erstellungsdatum zurück */
    public Date getDateCreated() {
        return dateCreated;
    }

    /** Gibt eine textuelle Repräsentation des Objekts zurück */
    @Override
    public String toString() {
        return "erstellt am " + dateCreated + "\nFarbe: " + color +
               " und gefüllt: " + filled;
    }
}
