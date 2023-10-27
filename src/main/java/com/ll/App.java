package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    ArrayList <String> WS = new ArrayList<>();
    ArrayList <String> A = new ArrayList<>();
    int CountNumber;
    void run() {
        System.out.println("==명언 앱==");

        while(true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();
            if(cmd.equals("종료")){
                break;
            }

            if(cmd.equals("등록")){

                System.out.print("명언 : ");
                String ws = scanner.nextLine();

                System.out.print("작가 : ");
                String a = scanner.nextLine();

                continue;
            }

            else{
                System.out.println("등록되지 않은 명령 입니다.");
                System.out.println("올바른 명령을 입력해주세요.");


                continue;
            }
        }
    }

}

