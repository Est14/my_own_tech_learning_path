lucky_namber = [5, 8, 73, 12, 13, 63, 100]
friends = ['Pipe', 'Santi', 'Daniela', 'Miguel', 'Camilo']


print(friends[3])
print(friends[-1])

friends.extend(lucky_namber)  # The funtion extend add another list

friends.append('Ivan')  # This funtion add a new element in the last position of the list 
print(friends)

friends.insert(3, 'Paula') # This funtion insert a new element in any position that you want 
print(friends)

friends.remove('Miguel')  # This funtion remove an expecifict element
print(friends)

friends.pop()    # Remove the last element in the list
print(friends)

friends.index('Paula') # Print the index where Paula is locate

friends.sort()  # sort the list 
print(friends)

friends.reverse() # Reverse the list 
print(friends)

friends_2 = friends.copy()  # Copy a list 
print(friends_2)
