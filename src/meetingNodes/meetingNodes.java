package meetingNodes;
import java.io.*;
import java.util.*;

public class meetingNodes {

	
	public static int computePointOfInterception(int x, int y) {
		
		while(x!=y)
		{
		
		if(x==12)
			x=2;
		else if(x<12)
		{
			x+=2;
			if(x>12)
				x=x-12;
		}
		
		if(y==12)
			y=1;
		else if(y<12)
		   y+=1;
		
		if(x==y)
			break;
		
		System.out.println(x +" "+ y);
		}
		
	
		return x;
	  }
	
	public static void main(String[] args)
	{
		
		//creating a linkedlist using collections
		   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the x AND y coordinates");
		   int x=sc.nextInt();
		   int y=sc.nextInt();
				   
		   
		   int res=computePointOfInterception(x,y);
		   System.out.println(res);
		 
		   
	}

}
