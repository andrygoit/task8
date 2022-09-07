public class Square extends Shape{
    private String name;
    public Square(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }
}