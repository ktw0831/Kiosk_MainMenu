package a_010_java_after2;

import java.util.Scanner;

public class Kiosk_MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    while(true) {
	    	System.out.println("===========================================");
	    	System.out.println("********     KIOSK 상품등록 및 매장 운영프로그램    ********");
	    	System.out.println("===========================================");
	    	System.out.println("  1. 상품코드 등록");
	    	System.out.println("  2. 등록된 상품코드 조회");
	    	System.out.println("  3. KIOSK 매장 운영 프로그램(주문입력)");
	    	System.out.println("  4. 매장 매출현황(주문서별 합계)");
	    	System.out.println("  5. 매장 주문서별 LIST");
	    	System.out.println("  6. 상품별 매출 수량 및 금액 총합");
	    	System.out.println("  7. 상품별/일자별 매출 LIST");
	    	System.out.println("  0. 작업을 종료합니다.");
	    	System.out.println("-------------------------------------------------------");
	    	System.out.println("작업 번호를 선택하세요?");
	    	
	    	int i_num = input.nextInt();
	    	if(i_num == 1) {
	    		Kiosk_Product_Insert.main(args);
	    	} else if(i_num == 2) {
	    		Kiosk_Product_InquiryChoice.main(args);
	    	} else if(i_num == 3) {
	    		Kiosk_Product_BuyChoice.main(args);
	    	}else if(i_num==4) {
	    		Kiosk_Product_BuyTotal.main(args);
	    	}else if(i_num==5) {
	    		Kiosk_Product_BuyList.main(args);	    		
	    	}else if(i_num==6) {
	    		Kiosk_Product_SalesListTotal.main(args);
	    	}else if(i_num==7) {
	    		Kiosk_Product_SalesList.main(args);	    			    		
	    	}if(i_num == 0) {
	    		System.out.println("작업을 종료합니다.");
	  }		
	    	break;
	}
  }
}