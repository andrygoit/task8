public abstract class Shape {
    public abstract void getName();

    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        circle.getName();
        GetFigureName figure1 = new GetFigureName();
        figure1.getFigureName(circle);

        Shape heptagon = new Heptagon("Heptagon");
        heptagon.getName();
        GetFigureName figure2 = new GetFigureName();
        figure2.getFigureName(heptagon);

        Shape hexagon = new Hexagon("Hexagon");
        hexagon.getName();
        GetFigureName figure3 = new GetFigureName();
        figure3.getFigureName(hexagon);

        Shape pentagon = new Pentagon("Pentagon");
        pentagon.getName();
        GetFigureName figure4 = new GetFigureName();
        figure4.getFigureName(pentagon);

        Shape triangle = new Triangle("Triangle");
        triangle.getName();
        GetFigureName figure5 = new GetFigureName();
        figure5.getFigureName(triangle);
    }
}