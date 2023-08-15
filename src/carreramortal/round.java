package carreramortal;
import java.text.DecimalFormat;
/**
 *
 * @author juanj
 */
public class round {

   public static void main(String args[]) {
      double d = 100.675;
      double e = 100.490;  //8bytes // <0.5
      float f =  (float) 100.10;  // 4 
      float g = 90.004f;
      double roundDbl = Math.round(d*100.0)/100.0;
      
      System.out.println(Math.round(d));
      System.out.println(Math.round(e)); 
      System.out.println(Math.round(f)); 
      System.out.println(Math.round(g)); 
      System.out.println(Math.round(roundDbl)); 
      
      double input = 9476.2351;
      DecimalFormat df = new DecimalFormat("##.##");
      System.out.println("Rounded Double value (DecimalFormat): "+df.format(input)); 
   }
}