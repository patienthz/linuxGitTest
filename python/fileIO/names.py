name =input("what's your name?")

file= open("names.txt","a")
file.write(f"{name}\n")
file.close