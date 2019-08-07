package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] arrGoods = new Goods[COUNT_GOODS];
		for(int i=0; i<COUNT_GOODS; i++) {			
			Goods goods = new Goods();			
			goods.setGoodsName(scanner.next());
			goods.setGoodsPrice(scanner.nextInt());
			goods.setGoodsCnt(scanner.nextInt());
			arrGoods[i] = goods;			
		}
		for(int i=0; i<COUNT_GOODS;i++) {
			System.out.println(arrGoods[i].getGoodsName()+"(가격:"+
					arrGoods[i].getGoodsPrice()+"원)이 "+
					arrGoods[i].getGoodsCnt()+"개 입고 되었습니다.");			
		}
		scanner.close();
	}
}
