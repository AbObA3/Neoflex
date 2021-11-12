public class Run {
    static double method1(double a , double b, double c, double d){
        return a * (b + (c / d));
    }
    static boolean method2(double a, double b) {
        return ((a+b)>=10 && (a+b)<=20);
    }
    static void method3(int a){
        if(a>=0)
            System.out.println("positive value");
        else
            System.out.println("negative value");
    }
    static boolean method4(int a){
        return (a<0);
    }
    static void method5(String name){
        System.out.println("Привет, " + name+ "!");
    }
    static void method6(int year){
        if(year % 4 == 0) {
            if(year % 100 ==0 && year % 400 !=0 )
                System.out.println("Год не високосный");
            System.out.println("Год високосный");
        }
        else
            System.out.println("Год не високосный");
    }
    public static void main(String[] args) {
        byte b = 11;
        short s = 45;
        int i = 564;
        long l = 324000L;
        float f = 32.04f;
        double d= 45.08;
        char c = 'f';
        boolean boo =true;
        String str ="rare";
        StringBuilder stb = new StringBuilder();
        stb.append(c);

        double val1 = method1(21,43,56,34);
        boolean val2 = method2(5,14);
        method3(-3);
        boolean val4 =method4(-14);
        method5("Dmitry");
        method6(2021);


    }
}

