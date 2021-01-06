my_set = set()  # Are mutable
my_set.add(1)
my_set.add(2)
my_set.add(3)

print(my_set)
#my_set.remove(2) # Remove the option passed 
my_set.pop()    # Remove the first element
print(my_set)

if 1 in my_set:
    print('yes')


odds = {1, 2, 3, 4, 5, 6, 7}
evens = {0,2,4,6,8}
primes = {2,3,5,7,11}

u = odds.union(evens)
print(u)

i = odds.intersection(evens)
print(i)

d = odds.difference(evens)
print(d)

s = odds.symmetric_difference(evens)
print(s)

evens.update(primes)
