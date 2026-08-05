#절차적 언어
# print('A')
# if 10!=20:
#     print('B')
#     print('E')
# print('C')
# print('D')

# #사용자에게서 숫자 하나를 입력받아 10보다 크면 크다가 출력되게 해보자.

# a=int(input("숫자를 입력하세요:"))
# if 10<a:
#     print('이숫자는 10보다 큽니다.')
# if 10>a:
#     print('이숫자는 10보다 작습니다.')
# print('프로그램을 종료합니다.')

#if else문
# print("a")
# if False:
#     print("b")
# else:
#     print("c")
# print("d")

# #두수를 입력받아 큰수를 출력해보자.

# a=int(input("처음 숫자하나를 입력하세요:"))
# b=int(input("두번째 숫자하나를 입력하세요:"))

# if a<b:
#    print(b,"두번째 숫자가 더 큽니다")
# else:
#     print(a,"처음 숫자가 더 큽니다")

# #if elif else문
# a=10
# if a>30:
#     print("30보다 크다")
# elif a>20:
#     print("20보다 크다")
# elif a>10:
#     print("10보다 크다")
# else:
#     print("10보다 작다")
# print("프로그램 종료합니다")
#두수를 입력받아서 큰지 작은지 같은지 출력하는 프로그램을 만들어 보자.

a=int(input("첫번째 수를 입력하세요:"))
b=int(input("두번째 수를 입력하세요:"))
if a<b:
    print(b,"첫번째수가 두번째수보다 작습니다.")
elif a==b:
    print("첫번째수가 두번째수와 같습니다.")
elif a>b:
    print(a,"첫번째수가 두번째수보다 큽니다.")
else:
    print("문제발생")
    