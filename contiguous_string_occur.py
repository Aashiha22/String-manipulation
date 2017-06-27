#input aaabbccdeefffaa   output:a3b2c2d1e2f3a2
#use python

str = "aaabbccdeefffaa"
str1 = []
str1.append(str[0])
str1.append(1)
for s in range(1,len(str)):
	if str[s] == str[s-1]:
		str1[-1] = str1[-1] + 1
	else:
		str1.append(str[s])
		str1.append(1)
print "str1 :   ",str1
a = 2
str2 = ""
for item in str1:
    str2 = str2 + item.__str__()

print str2
