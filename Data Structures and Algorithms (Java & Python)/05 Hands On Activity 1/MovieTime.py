movies = []
snacks = []
i = 0
j = 0

while i < 3:
    movie = input("Enter movie " + str(i+1) + " of 3: ")
    movies.append(movie)
    i += 1
    
while j < 3:
    snack = input("Enter snack " + str(j+1) + " of 3: ")
    snacks.append(snack)
    j += 1
    
print("Movies to watch are: deque(" , movies , ")")
print("Snacks available are: deque(" , snacks , ")")
print("Press S each time you finish a snack.")

while True:
    finish = input()
    if finish == 's':
        snacks.pop(0)
        if not snacks:
            print("No more snacks.")
            break
    
    print("deque(" , snacks , ")")