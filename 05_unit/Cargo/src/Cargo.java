/*
Создайте иммутабельный класс для хранения информации о грузах, передаваемых
 в курьерскую службу. Название класса придумайте самостоятельно.
Создайте у класса следующие поля:
габариты;
масса;
адрес доставки;
свойство — можно ли переворачивать;
регистрационный номер (может содержать буквы);
является ли груз хрупким.
Названия полей придумайте самостоятельно.
Типы полей задайте в соответствии с данными, которые в них содержатся.

Габариты — ширина, высота и длина — должны храниться в отдельном иммутабельном классе
 Dimensions. Создайте класс Dimensions с соответствующими полями и реализуйте в нём метод
 вычисления объёма груза (название метода придумайте самостоятельно).
Реализуйте в классе методы, дающие возможность изменять адрес доставки, габариты и массу груза
 без изменения исходного объекта путём создания его копии.
 */
public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions,
                 int weight,
                 String address,
                 String registrationNumber,
                 boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }


    //конструктор для создания объекта
    public Cargo(){
        weight = 0;
        address = "";
        registrationNumber = "";
        fragile = false;
        dimensions = null;
    }
    // Setters of dimensions, weight and address
    public Cargo setDimension (Dimensions dimension){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile); //Почему в круглых скобках не белым цветом?
    }

    public Cargo setWeight (int weight){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile);
    }

    public Cargo setAddress (String address){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile);
    }

    //Getters all variables
    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString(){
        return dimensions + "/n"+
                "Weight: "+ weight + "kg"+ "/n"+
                "Address: " + address + "/n"+
                "Registation number: " + registrationNumber + "/n"+
                "Fragile: " + fragile;
    }
}
