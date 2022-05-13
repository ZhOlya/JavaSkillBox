public class Dimensions {
    private final double latitude;
    private final double height;
    private final double lenght;

    public Dimensions(double latitude, double height, double lenght) {
        this.latitude = latitude;
        this.height = height;
        this.lenght = lenght;
    }


    public double getLatitude() {
        return latitude;
    }

    public double getHeight() {
        return height;
    }

    public double getLenght() {
        return lenght;
    }

    public Dimensions changeDimensions (double latitude, double height, double lenght){
        return new Dimensions(latitude, height, lenght);
    }

    public Dimensions setLatitude(double latitude) {
        return new Dimensions(latitude, height, lenght);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(latitude, height, lenght);
    }

    public Dimensions setLenght(double lenght) {
        return new Dimensions(latitude, height, lenght);
    }

    public double volume(){
        return latitude * height * lenght;
    }

    public String toString (){
        return "Latitude: " + latitude + "cm" + "\n"+
                "Height: " + height + "cm" + "\n"+
                "Lenght: " + lenght + "cm" + "\n"+
                "Volume: " + volume() + "cm 3"+ "\n";
            }
}
