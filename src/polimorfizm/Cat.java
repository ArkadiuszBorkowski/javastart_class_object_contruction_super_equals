package polimorfizm;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Jestem kotem i nazywam się " + getName());
    }

    public void miau() {
        System.out.println("miau hau");
    }
}