def get_kinetic_energy(vel, ma):
    return round(0.5 * ma * (vel**2), 2)


mass = float(input("Enter mass in kilograms: "))
velocity = float(input("Enter velocity in meters per second: "))
print("The object's kinetic energy is: " + str(get_kinetic_energy(velocity, mass)) + " J.")
