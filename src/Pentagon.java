public class Pentagon extends Shape{
    private String name;
    public Pentagon(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Figure: " + this.name);
    }
}