class Box {
    private double width;
    private double heigth;
    private double depth;
    private double mass;
    private double density;

    public Box (double width, double heigth, double depth, double mass) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
        this.mass = mass;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return mass/(width*heigth*depth);
    }
}