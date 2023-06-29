import random


def numbers(num, i):
    if num == 10:
        print("Congratulations, your score is: " + str(i))
    else:
        array = [random.randint(0, 50), random.randint(0, 50), random.randint(0, 50), random.randint(0, 50), random.randint(0, 50), random.randint(0, 50), random.randint(0, 50)]
        print(array)
        answer = int(input("What is the largest number: "))
        if answer == max(array):
            print("Correct Answer")
            i += 1
        else:
            print("Wrong Answer")
        numbers(num + 1, i)


print("Choose the largest number from the following")
numbers(0, 0)