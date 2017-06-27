#include <stdio.h>
#include <string.h>


//Printing characters in a string using c

int main(void) 
{
	char s[] = "aabbcdeff";
	for(int i=0;s[i]!='\0';i++)
	{
		printf("%c ",s[i]);
	}
	return 0;
}
