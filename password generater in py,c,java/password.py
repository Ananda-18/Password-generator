import random
a =int(input("enter the digit size"))
b=int(input("entrer number of passwords"))
lower_case="qwertyuiopasdfghjklzxcvbnm"
upper_case="QWERTYUIOPASDFGHJKLZXCVBNM"
num="123456789"
all=""
all=lower_case+num+upper_case
for i in range(b):
        password="".join(random.sample(all,a))
        print(password)



