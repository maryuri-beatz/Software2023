public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando....");
        System.out.println("Car....");
        Car car = new Car("AMQ123", new Account("Andres Loiza","ADN12365","andresl@hotmail.com","12365"));

        car.pssenger = 4;
        car.printDataCar();

        System.out.println("Uberx....");
        UberX uberx = new UberX ("MKL185", new Account("Maria Loyola", "JKL12365", "marial@hotmail.com", "125478") ,"Toyota","Corolla" );

    }
}