package xyz;

public class RemoveFun {
	
	public String remove(String s){
	  if(s.charAt(0)=='A' && s.charAt(1)=='A')
	      return s.substring(2);
	  else if(s.charAt(0)=='A' && s.charAt(1)!='A')
	      return s.substring(1);
	  else if(s.charAt(0)!='A' && s.charAt(1)=='A')
	      return s.substring(0,1)+s.substring(2);
	  else
	      return s;
	}
}
