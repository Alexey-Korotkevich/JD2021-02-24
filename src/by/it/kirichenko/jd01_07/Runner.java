package by.it.kirichenko.jd01_07;

import by.it._classwork_.jd01_07.Matrix;

public class Runner {
    public static void main(String[] args) {
        Var var1 = new Scalar(9);
        Scalar var2 = new Scalar("12.1234");
        Var var3 = new Scalar(var2);
        System.out.printf("var1=%s\n", var1);
        System.out.printf("var2=%s\n", var2);
        System.out.printf("var3=%s\n", var3);

        Vector vec4 = new Vector(new double[]{1, 2, 3, 4, 5});
        Var vec5 = new Vector(vec4);
        Var vec6 = new Vector("{1,2,4}");
        System.out.printf("vec4=%s\n", vec4);
        System.out.printf("vec5=%s\n", vec5);
        System.out.printf("vec6=%s\n", vec6);

        Matrix matr7 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        System.out.printf("matr7=%s\n", matr7);
    }
}
