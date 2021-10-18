
public class App {
    public static void main(String[] args) throws Exception {
        presson p = new presson();
        p.BMI();
        System.out.println("Phương thức tính BMI có kiểu dữ liệu trả về là double: " + p.bmi());
        System.out.println("Phương thức tính BMI có kiểu dữ liệu trả về là double có truyền tham số: " +p.bmi1(52.5, 1.72));
        
    }

}
