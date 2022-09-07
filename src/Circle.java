public class Circle extends Shape {
    private  String name;
    public Circle(String name){
        this.name = name;
    }
    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }

}