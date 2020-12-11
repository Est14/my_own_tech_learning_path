lucky_namber = [5, 8, 73, 12, 13, 63, 100]
friends = ['Pipe', 'Santi', 'Daniela', 'Miguel', 'Camilo']

print(friends)
print(friends[3])
print(friends[-1])
#friends.extend(lucky_namber)  # The funtion extend add another list
print(friends)
friends.append('Ivan')  # This funtion add a new element in the last position of the list 
print(friends)
friends.insert(3, 'Paula') # This funtion insert a new element in any position that you want 
print(friends)
friends.remove('Miguel')  # This funtion remove an expecifict element
print(friends)
friends.pop()    # Remove the last element in the list
print(friends)
print(friends.index('Paula'))
friends.sort()
print(friends)
friends.reverse()
print(friends)
friends_2 = friends.copy()
print(friends_2)
