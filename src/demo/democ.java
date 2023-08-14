package demo;

public class democ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a ="NITIN";
       String b ="";
       // if i want to reverse the string how can i do that 
       for(int i=a.length()-1; i>=0; i--)
       {
		//System.out.println(a.charAt(i)); //this is called the looping 
    	   b = b+a.charAt(i);
       }
       System.out.println(b);
       //now they store the value of a into b 
       // now we have check whether it is palindrome or not so for that we start comparing
       System.out.println("this is a palindrome string");
}
	}