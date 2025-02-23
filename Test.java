//Luis Jimenez
//Ex. 16.4

//Imports 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;
//Public class Test
public class Test {
	
	public static void main(String[] args){
	      LinkedList<Integer>  lists = new LinkedList<Integer>();
	      int ogNumber;
	      Random RdmNumber = new Random();
	     
	      for(int n = 0;n < 25; n++){
	          ogNumber = RdmNumber.nextInt(101);
	          lists.add(ogNumber);
	         
	      }
	      Collections.sort(lists);
	      System.out.println(lists);
	      int total = 0;
	      Iterator<Integer>iterator = lists.iterator();
	      
	      while (iterator.hasNext()){
	    	  //The sum calculated here 
	          total = total + iterator.next();
	      }//Prints out average and sum
	    System.out.printf("Sum is:  %d%nAverage is: %.2f", total , (double)(total/25));
	    }
	}	




