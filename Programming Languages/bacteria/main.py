init = int(input("Enter initial count of bacteria: "))
hours = int(input("Enter the number of hours: "))
print("The number of bacteria per hour will be:")
for i in range(init):
    ans = (i + 1) * (2 ** (hours * 3))
    print("Hour " + str(i + 1) + " = " + str(ans))