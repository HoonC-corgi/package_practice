import FileIO.Tools;
// import UI.Tools; 와 함께 쓰면 충돌

public class Main {
    public static void main(String[] args) {
        //FileIO.Tools t = new FileIO.Tools();
        Tools t = new Tools();
        t.hello();
        UI.Tools t2 = new UI.Tools();
        t2.hello();

        Point p1 = new Point(2, 4);
        Point p2 = new Point(2, 4);

        System.out.println(p1);
        System.out.println(p1.getClass());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.hashCode());

        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(p1.toString());
        String s = "객체 설명: " + p1; // == p1.toString();
        System.out.println(s);

        if(p1==p2) {    // p1, p2의 밸류는 같아도 참조값이 다르기에 비교 불가
            System.out.println("같다.");
        }
        else {
            System.out.println("다르다.");
        }

        if(p1.equals(p2)) {     // p1, p2의 밸류는 같아도 참조값이 다르기에 비교 불가
            System.out.println("같다.");
        }
        else {
            System.out.println("다르다.");
        }

        if(p1.equals(t)) {
            System.out.println("같다.");
        }
        else {
            System.out.println("다르다.");
        }

        String s1 = "영남대";
        String s2 = "컴공";
        String s3 = "영남대";
        String s4 = new String("영남대");
        String s5 = new String("영남대");

        if(s1==s3) {    // 리터럴은 중복 생성이 되지 않기에 같은 참조값을 가짐
            System.out.println("2같다.");
        }
        else {
            System.out.println("2다르다.");
        }
        if(s1==s2) {
            System.out.println("2같다.");
        }
        else {
            System.out.println("2다르다.");
        }

        if(s4==s5) {    // 객체는 메모리가 동적할당 되어 생기기에 다른 참조값을 가짐
            System.out.println("2같다.");
        }
        else {
            System.out.println("2다르다.");
        }

        if(s4=="영남대") { // 영남대는 리터럴, s4는 힙에 저장되게 참조값이 다름
            System.out.println("2같다.");
        }
        else {
            System.out.println("2다르다.");
        }

        if(s4.equals("영남대")) {  // equals는 문자열 비교, 같다고 나옴
            System.out.println("2같다.");
        }
        else {
            System.out.println("2다르다.");
        }
    }
}
