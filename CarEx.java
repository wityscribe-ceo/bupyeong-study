package com.the.ex;
import com.the.dto.*;
public class CarEx {

	public static void main(String[] args) {
		Car Car=new Car();
		Car.color="빨강";
		Car.company="현대";
		Car.maxSpeed=40;
		Car.tire.company="금호타이어";
		Car.tire.mileage=20;
		Car.tire.price=4000;
		
		System.out.println(Car.color);
		System.out.println(Car.tire.company);
		
		
//		Car newCAr=car;// 같은데이터 주소복사
		Car newCar=new Car();
		newCar.color=Car.color;
		newCar.tire.company=Car.tire.company;
		newCar.tire.price=Car.tire.price;
		newCar.tire.mileage=Car.tire.mileage;
		
		
//		newCar.tire=Car.tire;  주소 복사되어서 같은 타이어가 된다.
		
		
	}

}
