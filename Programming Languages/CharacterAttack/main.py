def get_attack_speed(base, bonus, lev):
    return round(base * (1 + ((bonus / 100) * (lev - 1))), 3)


base_attack = float(input("Enter the base attack speed: "))
bonus_attack = float(input("Enter the bonus attack speed %: "))
level = int(input("Enter the level: "))
print("The character's current attack speed is " + str(get_attack_speed(base_attack, bonus_attack, level)) + ".")
