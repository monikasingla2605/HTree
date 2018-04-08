package htree;

public class HTreeConstruc
{
    public static void drawHTree(double length, int depth, double x, double y)
    {
      double xleft = x-(length/2);
      double xright = x+(length/2);
      double yleft = y- (length/2);
      double yright = y+(length/2);
      if(depth>0)
      {
        double len = length/(Math.sqrt(2));      
        drawLine(xleft, y, xright, y);
        drawLine(xleft, yleft, xleft, yright);
        drawLine(x+(length/2), yleft, xright, yright);
        drawHTree(len, depth-1, xleft,yleft);
        drawHTree(len, depth-1, xleft,yright);
        drawHTree(len, depth-1, xright,yleft);
        drawHTree(len, depth-1, xright,yright);
       }
     }
     public static void drawLine(double x, double y, double xfin, double yfin)
     {
      System.out.println("initial co-ordinates are "+ x+" and "+y);
      System.out.println("final co-ordinates are "+ xfin+" and "+yfin);
     }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println( "Practice makes Perfect!" );
        drawHTree(5.0,3,4.0,4.0);
      
    }

}
