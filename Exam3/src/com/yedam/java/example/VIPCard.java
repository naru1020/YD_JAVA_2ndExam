package com.yedam.java.example;

public class VIPCard implements Payment {
	private final String name = "VIPCard";	//카드명
	private String grade;					//적용 등급
	private double saleRatio;				//할인율
	private int point;						//적립 포인트
	private double pointRatio;				//포인트 적립율

	public VIPCard() {
		this.grade = "GOLD";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}

	@Override
	public int offline(int price) {
		return (int) (price - price*saleRatio - price*offlinesale);
	}

	@Override
	public int online(int price) {
		return (int) (price - price*saleRatio - price*onlinesale);
	}

	@Override
	public int simple(int price) {
		return (int)(price - price*saleRatio - price*simplesale);
	}

	@Override
	public void showCardInfo(int price) {
		System.out.println("====== 카드 정보 ======");
		System.out.println("카드명 :" + name);
		System.out.println("적용 등급 : " + grade);
		System.out.println("할인율 : " + saleRatio);
		System.out.println("포인트 적립률 : " + pointRatio);
		System.out.println("적립 포인트 : " + (int)(point + price*pointRatio));
		
	}

}
