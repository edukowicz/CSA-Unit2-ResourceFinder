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
        double rounded = (double)x/100;                   // this line concludes the operations used to round the density to the hundredths place
        if ((rounded >= 1.77) && (rounded <= 3.2)){.      // here, the code checks if the density is within the range of the densities of sedinmentary rocks; if it is, the code prints a statement  
          System.out.println("Row " + r + " and column " + c + " have a sedimentary rock with a density of " + rounded);
          System.out.println("");
        }
        if ((rounded >= 0.35) && (rounded <= 0.55)){.     // here, the code checks if the density is within the range of the densities of unpacked snow; if it is, then the code pritns a statement
          System.out.println("Row " + r + " and column " + c + " have unpacked snow with a density of " + rounded);
          System.out.println("");
        }
      }
    } 
  }
}
