package own;

public class Test{
public static void main( String [] args ) {
      int i = 2, j = 0;
      switch(i) {
          case 1 : j+= 0;
          case 2 : j+= 2;
          case 4 : j+= 4;
          default : j += 6;
      }
	System.out.println( j );
}
}
