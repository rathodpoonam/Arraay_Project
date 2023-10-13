package Array_Operation;
import java.util.Scanner;
public class ArrayTest {
	static Project ob=new  Project();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sixe of Array");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    for(int i=0;i<a.length;i++) {
	    	System.out.println("Enter "+(i+1)+"element");
	    	a[i]=sc.nextInt();
	    }
	    while(true) {
	    	System.out.println("\n 1.Insert \n 2.Delete \n 3.Update \n 4.Sort"
	    			+ " \n 5.Search \n 6.Reverse \n 7.Display \n 8.Min \n 9.Max \n 10.isEmpty \n 11.Exit");
	    	int option=sc.nextInt();
	    	switch(option) {
	    	case 1:{
	    		System.out.println("Enter the new element to insert");
	    		int new_ele=sc.nextInt();
	    		System.out.println("Enter the position to insert new element");
	    		int ops=sc.nextInt();
	    		a=ob.insert(a, new_ele, ops);
	    		ob.display(a);
	    		break;
	    	    }
	    	case 2:{
	    		System.out.println("Enter deleting element");
	    		int ele=sc.nextInt();
	    		a=ob.delete(a, ele);
	    		ob.display(a);
	    		break;
	    	}
	    	case 3:{
	    		System.out.println("Enter new element");
	    		int new_ele=sc.nextInt();
	    		System.out.println("Enter replacing element");
	    		int replace_ele=sc.nextInt();
	    		a=ob.update(a, replace_ele, new_ele);
	    		ob.display(a);
	    		break;
	    	}
	    	case 4:{
	    		ob.sort(a);
	    		ob.display(a);
	    		break;
	    	}
	    	case 5:{
	    		System.out.println("Enter the searching element");
	    		int ele =sc.nextInt();
	    		int index=ob.search(a, ele);
	    		if(index==-1) {
	    			System.out.println("Element not found");
	    		}
	    		else {
	    			System.out.println("element found at position"+(index+1));
	    		}
	    		break;
	    	}
	    	case 6:{
	    		int rev[]=ob.reverse(a);
	    		ob.display(rev);
	    		break;
	    	}
	    	case 7:{
	    		ob.display(a);
	    		break;
	    	}
	    	case 8:{
	    		int min=ob.min(a);
	    		System.out.println("Minimum element is:"+min);
	    		break;
	    	}
	    	case 9:{
	    		int max=ob.max(a);
	    		System.out.println("Maximum element is:"+max);
	    		break;
	    	}
	    	case 10:{
	    		if(ob.isEmpty(a)) {
	    			System.out.println("Array is Empty");
	    		}
	    		else {
	    			System.out.println("Array is not Empty");
	    		}
	    		break;
	    	}
	    	case 11:{
	    		System.exit(0);
	    	}
	    	default:{
	    		System.out.println("Choose the correct option");
	    	}
	    	}
	    }

	}

}
