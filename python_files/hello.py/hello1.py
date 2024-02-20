# Open the file in write mode
with open(r"C:\Users\91957\OneDrive\Desktop\Data.txt", 'w') as f1:
    # Write a line to the file
    f1.write("this is my own file experiment\n")

# Open the file in read mode separately
with open(r"C:\Users\91957\OneDrive\Desktop\Data.txt", 'r') as f2:
    # Read and print the contents of the file
    for line in f2:
        print(line)
