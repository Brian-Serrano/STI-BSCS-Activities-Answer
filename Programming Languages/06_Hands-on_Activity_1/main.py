def check_remainder(num):
    removed_num = str(num)[:-1]
    removed_num += str(int(removed_num) % 7)
    return int(removed_num) == num


number = int(input("Enter a 6-digit number: "))
print(check_remainder(number))
