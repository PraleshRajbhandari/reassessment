interface CoffeeTable {
    void placeCoffee();
}
class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on a modern coffee table.");
    }
}

class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on an ArtDeco coffee table.");
    }
}

class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeCoffee() {
        System.out.println("Placing coffee on a Victorian coffee table.");
    }
}