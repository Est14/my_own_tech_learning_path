# Open and read Files 
employeeFile = open('employees.txt', 'r')
for employee in employeeFile.readlines():
    print(employee)

ifIsReadable = employeeFile.readable()  # This is to prove if the file is readable return True or False 
allContent = (employeeFile.read())      # This is for read all content of the file 
justFirstLine = (employeeFile.readline())  # This is just for read one line of the file 
listOfContent = employeeFile.readlines()
print(listOfContent)  
employeeFile.close()

# Oper or vreate and write files
employeeFile = open('employees.txt', 'a') # Append to the file 
employeeFile.write('\nPipe - Carpinter')
employeeFile.close()