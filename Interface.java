package project;

public class Interface {
	 private static final int Alphabets = 26;
	 
	    public static void main(String[] args) {
	    	
	    	String input = "The girl wants to get some flowers so she goes to garden and take the flowers which is very beautiful.so she gives the flowers with her frinds ";
	    	System.out.println("The String is : "+isFrame(input));
	    }
	    public static boolean isFrame(String input)
	    {
	    	char[] str = input.toCharArray();
	    	if(input.length()<Alphabets)
	    	{
	    		return false;
	    	}
	    	for(int i = 'A' ;i <= 'Z' ; i++)
	    	{
	    		if(input.indexOf(i)<0 && input.indexOf(i+32) < 0)
	    		{
	    			return false;
	    		}
	    	}
	    	return true;
	    }
}
