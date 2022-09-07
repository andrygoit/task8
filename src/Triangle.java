public class Triangle extends Shape {
    private String name;
    public Triangle(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }
}