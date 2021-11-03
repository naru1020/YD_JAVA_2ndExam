package com.yedam.java.example;

public class GreenCard implements Payment {
	private final String name = "GreenCard";	//카드명
	private String grade;						//적립 등급
	private int point;							//적립 포인트
	private double pointRatio;					//포인트 적립율

	public GreenCard() {
		this.grade = "SILVER";
		this.point = 0;
		this.pointRatio = 0.05;
	}

	@Override
	public int offline(int price) {
		return (int) (price - price*offlinesale);
	}

	@Override
	public int online(int price) {
		return (int) (price - price*onlinesale);
	}

	@Override
	public int simple(int price) {
		return (int)(price - price*simplesale);
	}

	@Override
	public void showCardInfo(int price) {
		System.out.println("====== 카드 정보 ======");
		System.out.println("카드명 : " + name);
		System.out.println("적용 등급 : " + grade);
		System.out.println("포인트 적립률 : " + pointRatio);
		System.out.println("적립포인트 : " + (int)(point + price*pointRatio));
	}

}
