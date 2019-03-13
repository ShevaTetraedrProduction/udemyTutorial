public class Challenge30 {
    public void lesson() {
     char s = 'K';

     switch (s) {
         case 'A':
             System.out.println("It is " + s);
             break;

         case 'B':
             System.out.println("It is " + s);
             break;

         case 'C':
             System.out.println("It is " + s);
             break;

         case 'D': case 'E':
             System.out.println("It is " + s);
             break;

             default:
                 System.out.println("Somthing else -->" + s);
                 break;
     }

    }
}
