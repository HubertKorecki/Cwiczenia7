abstract class Animal {
    public abstract void makeNoise();
    public void roam() {
        System.out.println("Zwierzę przemieszcza się.");
    }
}

abstract class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("Zwierzę z rodziny kotowatych przemieszcza się cicho i z gracją.");
    }
}

abstract class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("Zwierzę z rodziny psowatych przemieszcza się energicznie.");
    }
}

class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Kot: Miau");
    }
}

class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lew: Roar!");
    }
}

class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Pies: Hau hau");
    }
}

class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wilk: Auuuuu");
    }
}
