package excercises.chapter_11;

import java.util.Date;

import excercises.chapter_13.Triangle;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    protected String color = "white";
    protected boolean isFilled;
    protected Date dateCreated;

    /** Konstruktor für ein Standard-GeometricObject */
    public GeometricObject() {
        this.dateCreated = new Date();
    }

    /** Konstruktor für ein GeometricObject mit spezifischer Farbe und Füllung */
    public GeometricObject(String color, boolean isFilled) {
        this.dateCreated = new Date();
        this.color = color;
        this.isFilled = isFilled;
    }

    /** Gibt die Farbe zurück */
    public String getColor() {
        return color;
    }

    public abstract double getArea();

    /** Setzt eine neue Farbe */
    public void setColor(String color) {
        this.color = color;
    }

    /** Gibt den Füllstatus zurück (true/false) */
    public boolean isFilled() {
        return isFilled;
    }

    /** Setzt einen neuen Füllstatus */
    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    /** Gibt das Erstellungsdatum zurück */
    public Date getDateCreated() {
        return dateCreated;
    }

    /** Gibt eine textuelle Repräsentation des Objekts zurück */
    @Override
    public String toString() {
        return "erstellt am " + dateCreated + "\nFarbe: " + color +
               " und gefüllt: " + isFilled;
    }

    @Override
    public int compareTo(GeometricObject o) {
       return Double.compare(this.getArea(), o.getArea());
    }
}
