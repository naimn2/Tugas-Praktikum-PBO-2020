class Box {

    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public void setMass(double mass){
        this.mass = mass;
    }
    public double getDensity(){
        density = mass/(width*height*depth);
        return density;
    }



    
}