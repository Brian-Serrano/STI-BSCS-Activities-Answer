def get_secondary_color(c1, c2):
    colors = ["red", "yellow", "blue", "orange", "violet", "green"]
    for i in range(len(colors)):
        if c1.lower() == colors[i]:
            color_index_1 = i + 1
        if c2.lower() == colors[i]:
            color_index_2 = i + 1

    return colors[color_index_1 + color_index_2]


print("Enter the colors that you want to mix.")
color1 = input("Enter first color: ")
color2 = input("Enter second color: ")
print(color1 + " + " + color2 + " = " + get_secondary_color(color1, color2))
