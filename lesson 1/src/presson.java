public class presson {
    public void BMI(){
        double weight = 52.5;
        double height = 1.72;
        System.out.println("Phương thức tính BMI có kiểu trả về là void: " + weight/(height*height));
    }
    public double bmi(){
        double weight = 52.5;
        double height = 1.72;
        double BMI = weight/(height*height);
        return BMI;
    

    }
    public double bmi1(double weight, double height){
        return weight/(height*height);
    }
}
