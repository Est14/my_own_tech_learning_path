lucky_namber = [5, 8, 73, 12, 13, 63, 100]
friends = ['Pipe', 'Santi', 'Daniela', 'Miguel', 'Camilo']

print(friends[3])
print(friends[-1])

for i in lucky_namber:
    print(i)

friends.extend(lucky_namber)  # The funtion extend add another list

friends.sort()  # sort the list 
print(friends)

friends.reverse() # Reverse the list    
print(friends)

friends_2 = friends.copy()  # Copy a list 
print(friends_2)
