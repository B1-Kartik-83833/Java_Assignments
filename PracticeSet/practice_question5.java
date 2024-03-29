public class practice_question5 {
    public static void main(String args[]){

        //String to float
        String s1 = "34.5f";
        float f1 =Float.parseFloat(s1);
        System.out.println("String =" + s1 + " to "+" float = " + f1 );

        // String to double
        String s2 = "34.6f";
        double d1 = Double.parseDouble(s2);
        System.out.println("String =" + s2 + " to "+" double = " + d1 );

        //Float to float
        Float F = new Float(34.4f);
        float ff7 = F.floatValue();
        System.out.println(ff7);

        //Double to double
        Double d = new Double(56.77);
        double d8 = d.doubleValue();
        System.out.println(d8);

        //float to String
        float f5 = 434.45f;
        String s5 = String.valueOf(f5);
        System.out.println(s5);

        //double to String
        double d6 = 45.5;
        String s6 = String.valueOf(d6);
        System.out.println(s6);

        // float to Float
        float f = 4.5f;
        Float ff = Float.valueOf(f);
        System.out.println(ff);

        //double to Double
        double d2 = 6.7;
        Double dd = Double.valueOf(d2);
        System.out.println(dd);



    }
}
