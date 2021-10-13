from collections import deque,defaultdict,Counter

# We can use deque to create a list of a definitive length 

# Creating a list of 10 elements
temp = deque(maxlen=5)

# It also makes insertion easier as compared to regular lists

temp.append(1)
temp.append(2)
temp.appendleft(3)
temp.appendleft(4)
temp.append(5)
print(temp)
temp.append(6)
print(temp)
temp.popleft()
temp.pop()


# Using counter to find occurences
temp_str = Counter('abrakadabra')
print(temp_str)
print(temp_str['a'])
print(temp_str.most_common(1))

# using default dictionary
temp_dict = [("key1", 3), ("key2", 5), ("key3", 6), ("key2", 7)]

d = defaultdict(list)
for key,value in temp_dict:
    d[key].append(value)
print(d)

# other way to do this is
d = dict()
for key,value in temp_dict:
    d.setdefault(key, []).append(value)
print(d)