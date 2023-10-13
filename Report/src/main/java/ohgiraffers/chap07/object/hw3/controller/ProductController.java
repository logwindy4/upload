package ohgiraffers.hw3.controller;

import ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    private ProductDTO[] pro = null;
    public int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
    do{
        System.out.println("=====제품 관리 메뉴=====");
        System.out.println("1. 제품 정보 추가");
        System.out.println("2. 제품 전체 조회");
        System.out.println("9. 프로그램 종료");
        System.out.println("번호를 입력해 주세요.");
        int num = sc.nextInt();

    }while(false);

    }
    public void productInput(){

    }
    public void productPrint(){

    }


}
