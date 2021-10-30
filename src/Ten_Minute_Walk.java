import java.util.Locale;
import java.util.Scanner;

public class Ten_Minute_Walk {
    static int i = 0;
    static int j = 0;
    static boolean b;

    public static void main(String[] args){
        isValid(new char[] {'w', 'n', 'w', 'n', 'e', 's', 'e', 's','w', 'w'});
        System.out.println(b);

    }

    public static   boolean isValid(char[] walk ) {
      int a = walk.length;
      if (a != 10 ){
          return false;
      }
          for (char c :walk ) {
              switch(c){
                  case 'n':
                      j++;
                      break;
                  case 'e':
                      i++;
                      break;
                  case 's':
                      j--;
                      break;
                  case 'w':
                      i--;
                      break;
                  default:throw new IllegalStateException("Unknown direction: " + c);
              }


          }




        return  i == 0 && j == 0;
    }
}
