// Resource Finder Starter Code              A+CR
class Main {
  public static void main(String[] args) {
    Measure world = new Measure();
		
    for(int r = 0; r < 30; r++){
      for(int c = 0; c < 20; c++){
        double density = world.getMaterial(r, c);         // here i set the variable "density" to the number (of the density) in row "r" and column "c"
        density = density * 100;
        density = density + 0.5;
        int x = (int)density;
        double rounded = (double)x/100;                   //this line concludes the operations used to 
        if ((rounded >= 1.77) && (rounded <= 3.2)){
          System.out.println("Row " + r + " and column " + c + " have a sedimentary rock with a density of " + rounded);
          System.out.println("");
        }
        if ((rounded >= 0.35) && (rounded <= 0.55)){
          System.out.println("Row " + r + " and column " + c + " have unpacked snow with a density of " + rounded);
          System.out.println("");
        }
      }
    } 
  }
}
