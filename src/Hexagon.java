public class Hexagon extends Shape{
    private String name;
    public Hexagon(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }
}
