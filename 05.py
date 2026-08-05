#9. 다음은 국어,영어,수학 점수를 입력 받아 평균을 구하여 다음과 
# 같이 출력하는 프로그램을 만들어보자. 
# 출력결과: 국어:80 영어:70 수학:90 평균:80

kor=int(input("국어점수 입력>>"))
eng=int(input("영어점수 입력>>"))
math=int(input("수학점수 입력>>"))

total_sum=kor+eng+math
total_avg=total_sum/3

print("국어:",kor,"영어:",eng,"수학:",math,"전체 합:",total_sum,"전체 평균:",total_avg)

#12. 연필 한박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원 이다.
#  소비자가 몇 박스와 연필 몇자루를 구매할 것인지 입력 받아 지불해야
#  할 돈을 계산해주는 프로그램을 만들어 보자.

pen_box=12
pen_one=1000

pen=int(input("펜을 몇자루 구매할건가요?>>"))
penbox=int(input("펜 박스를 몇박스 사실건가요?>>"))


total_boxone=(penbox*pen_box)+pen
total_avg=total_boxone*pen_one

print("구매할 팬박스:",penbox,"구매할 팬갯수:",pen,"구매할총 팬갯수:",total_boxone,"구매한 총금액:",total_avg)



