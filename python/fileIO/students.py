with open("students.csv") as file:
    for line in file:
        row=line.rstrip().split(",")
        print(f"{row[0]} in {row[1]}")