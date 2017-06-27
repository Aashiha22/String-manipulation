/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* print the unique characters and number of occurence in string -- use hash map in java */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "aabbcdeff";
		HashMap hm = new HashMap();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				int val = (int)hm.get(str.charAt(i));
				hm.put(str.charAt(i),val+1);
			}
			else
			{
				hm.put(str.charAt(i),1);
			}
		}
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+"    "+me.getValue());
		}
	}
}
