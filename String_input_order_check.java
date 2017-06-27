/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* #######################################################################
//input : "hello world!" order : hed! output: true, order :lw! output:false
########################################################################## */

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String input = "hello world!";
		String order = "lw!";
		int prevPos = 0;
		boolean ans = true;
		HashMap hm = new HashMap();
		//insert order chars with their position into hash map
		for(int i=0;i<order.length();i++)
		{
			hm.put(order.charAt(i),i);           //Key:letter, value:position
		}
    
    //iterating through the hash map
    
/*		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+"   "+me.getValue());
		}*/
    
    
		for(int j=0;j<input.length();j++)
		{
			char ch = input.charAt(j);
			if(hm.containsKey(ch))
			{
				int val = (int)hm.get(ch);
				if(prevPos > val)
				{
					ans = false;
					break;
				}
				else
				{
					prevPos = val;
				}
			}
		}
		System.out.println(ans);
	}
}
