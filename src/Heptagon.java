public class Heptagon extends Shape{
    private String name;
    public Heptagon(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }
}