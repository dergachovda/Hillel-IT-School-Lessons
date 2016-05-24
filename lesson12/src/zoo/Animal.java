package zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected int weight;

    public abstract void voice();

    public void walk() {
        System.out.println("Walk");
    }

}
