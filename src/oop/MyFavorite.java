package oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {

    final static String[][] questions = {

            {"가장 좋아하는 가수는? ", "아이유"},

            {"가장 좋아하는 배우는? ", "원빈"},

            {"가장 좋아하는 과목은? ", "자료구조"}

    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            showMenu();
            int what = scanner.nextInt();
            switch(what){
                case 1:
                    Question();
                    break;
                case 2:
                    getAnswers();
                    break;
                case 9:
                    System.out.println("Bye~");
                    return;
            }
        }
    }
    public static void showMenu(){
        System.out.println("------------------");
        System.out.println("1. 질문 선택");
        System.out.println("2. 정답 공개");
        System.out.println("9. 프로그램 종료");
        System.out.println("------------------");
        System.out.print("=> 메뉴 선택 ");
    }
    public static void Question(){
        Random random = new Random();
        int index = random.nextInt(3);
        System.out.print(questions[index][0]);
        Scanner scanner = new Scanner(System.in);

        if( scanner.next().equals(questions[index][1]))
            System.out.println("정답입니다!");

        else
            System.out.println("틀렸습니다!");
    }
    public static void getAnswers(){
        StringBuilder str = new StringBuilder()
                .append("<< 정답 출력 >>\n")
                .append(questions[0][0]).append(questions[0][1]).append("입니다.\n")
                .append(questions[1][0]).append(questions[1][1]).append("입니다.\n")
                .append(questions[2][0]).append(questions[2][1]).append("입니다.\n");
        System.out.print(str);
    }
}