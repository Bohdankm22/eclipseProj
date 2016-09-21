package william;

public class Lab1018c {
	 public static void main(String CODECLUB[])
	 {
	  con:
	   for(int i=1;i<=21;i++)
	   {
	    for(int j=1;j<22;j++)
	    {
	     if(j>i)
	     {
	      System.out.println();
	      continue con;
	     }
	     System.out.print(" "+(j));
	    }
	   }
	 System.out.println();
	 }
}
