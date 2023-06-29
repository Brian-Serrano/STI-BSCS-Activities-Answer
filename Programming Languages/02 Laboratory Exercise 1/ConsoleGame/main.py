import requests
import random


def shuffle_array(arr):
    random.shuffle(arr)
    return arr


def items(num, i, data):
    if num == 10:
        print("Congratulations, your score is: " + str(i))
    else:
        print(data[num]["question"])
        array = [data[num]["correctAnswer"], data[num]["incorrectAnswers"][0], data[num]["incorrectAnswers"][1], data[num]["incorrectAnswers"][2]]
        shuffle_array(array)
        for x in range(len(array)):
            print(str(x + 1) + ". " + str(array[x]))
        answer = int(input())
        if array[answer - 1] == data[num]["correctAnswer"]:
            print("Correct Answer")
            i += 1
        else:
            print("Wrong Answer")
        items(num + 1, i, data)


def fetch_api():
    url = "https://the-trivia-api.com/api/questions?limit=10"
    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()
        print(data)
        print("Choose the number of the correct answer.")
        items(0, 0, data)
    else:
        print(response.status_code)


fetch_api()
