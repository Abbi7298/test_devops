package practicenagp;

public class string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
 String a ="He/llo";
 String ab = new String("abhishak");
   System.out.println(a);
   System.out.println(a.charAt(2));// to get the character at 2nd place 
   System.out.println(a.codePointCount(0,4));//to know how much character 
   System.out.println(a.indexOf("e"));// to get the index of any character
   System.out.println(a.substring(1, 4));//to get the whole letters
   System.out.println(a.substring(5));//if we don't know the ending index
   System.out.println(a.concat("Hello"));//to Concat with another string if present otherwise we can direct pass letters 
	System.out.println(a.trim());// to trim the whitespaces
	System.out.println(a.toUpperCase());
	//split in string 
	String r[] =a.split("/");// in splitting of string we store it into a string  
	System.out.println(r[0]);
	System.out.println(r[1]);
	System.out.println(a.replace("l", "o"));
	}

}
