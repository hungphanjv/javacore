import java.security.Key;

public class lesson {
    public static void lesson(){
        String s = "học lập trình java không khó";
        System.out.println("Độ dài của chuỗi là: " + s.length());
        System.out.println("Viết in hoa chữ k trong chuỗi: " + s.replace('k', 'K'));
        System.out.println("Thay thế chữ khó thành dễ: " + s.replaceAll("khó", "dễ"));
    }
}
