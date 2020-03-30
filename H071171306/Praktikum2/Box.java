class Box{
  double width;
  double height;
  double depth;
  double mass;
  double density;

  public Box(double width, double height, double depth){
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public void setMass(double mass){
    this.mass = mass;
  }

  public double getDensity(){
    double density = mass / (width*height*depth);
    return density;
  }
}
