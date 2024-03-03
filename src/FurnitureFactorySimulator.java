
public class FurnitureFactorySimulator {
    public static void main(String[] args) {
        // Choose the desired furniture family
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();

        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        modernChair.sitOn();
        modernSofa.lieOn();
        modernCoffeeTable.placeCoffee();

        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianCoffeeTable.placeCoffee();

        Chair artDecoChair = artDecoFactory.createChair();
        Sofa artDecoSofa = artDecoFactory.createSofa();
        CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();

        artDecoChair.sitOn();
        artDecoSofa.lieOn();
        artDecoCoffeeTable.placeCoffee();

    }
}
