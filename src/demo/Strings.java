package demo;

class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a ="hEllo"; // one way to define/declare string
    String b ="hello";
    System.out.println(a.concat("worlds"));
    String s= new String("hello");//another way 
    String b1= new String("Abhishak");
    System.out.println(b1);//Strings are immutable means we can't alter our change
    // so as we know we can't alter java classes so we make two classes #StringBuffer & #StringBuilder
	StringBuffer sb = new StringBuffer("Abhishak");
	//System.out.println(sb.append("Abhishak"));
	//System.out.println(sb.insert(3, "a"));
	//System.out.println(sb.replace(2, 4, "s"));//at here it replace 2 index no. with the 3rd index no. not with the 4th one
	//System.out.println(sb.deleteCharAt(4));
	// in string buffer we can also reverse the string 
	System.out.println(sb.reverse());
	//StringBuilder is not thread safe & not synchronizing but it is faster 
	StringBuilder sa = new StringBuilder("Abhishak");
	sa.append(false);
	System.out.println(sa);
	System.out.println(s.equals(b1));//it compare the content 
    System.out.println(s==b1);//it compare on the  based of  refernce it means on is define as the class & first is define as the literal 
    System.out.println(a.equalsIgnoreCase(b));	}
	

}
