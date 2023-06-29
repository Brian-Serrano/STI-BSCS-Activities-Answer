set1 = set()
set2 = set()
set3 = set()

for i in range(3):
    month1 = input("Enter birth month " + str(i+1) + ": ")
    set1.add(month1)

for i in range(3):
    month2 = input("Enter birth month " + str(i+1) + ": ")
    set2.add(month2)
    
print("Group 1: " , set1)
print("Group 2: " , set2)

month3 = input("Enter your birth month: ")
set3.add(month3)

print("Union: " , str(set1 | set2))
print("Intersection: " , str(set1 & set2))
print("Difference: " , str(set1 - set2))

if (set3.issubset(set1 | set2)):
	print("You have the same birth month with one of your classmates")
else:
	print("You don't have the same birth month with one of your classmates")