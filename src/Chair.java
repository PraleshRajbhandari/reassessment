interface Chair {
    void sitOn();
}

class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}

class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}

class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an ArtDeco chair.");
    }
}
