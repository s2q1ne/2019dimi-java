package oop;

public class FamilyMember {
    private String memberName;
    private static int memberCnt;

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        memberCnt++;
    }

    public static void printMemberCnt(){
        System.out.printf("가족 총 인원 수 : %d명\n", memberCnt);
    }

    public String getMemberName() {
        return memberName;
    }
}
