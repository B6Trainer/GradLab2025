package com.bala.practice.exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            callingMethod();
        } catch (CustomException e) {
            //throw new RuntimeException(e);
            System.out.println("CustomException happened: "+e.getMessage());
            e.printStackTrace();
        } catch (Custom2Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Custom2Exception happened: "+e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //
            System.out.println("Finally block Executed ");

        }


//        try {
//            sampleMethod();
//        } catch (Custom2Exception e) {
//            throw new RuntimeException(e);
//        }


        System.out.println("This is the end of the program.");


    }

    public static void sampleMethod()  throws Custom2Exception{

        String text = "Java";
        text=null;
        System.out.println(text.length());

    }

    public static void callingMethod() throws Custom2Exception {

        executingMethod(10,10);
    }

    public static void executingMethod(int number1, int number2)
            throws Custom2Exception , CustomException {

        int result = number1/number2;
        if(result >10){
            throw new RuntimeException("The result is greater than 10");
        }
        if(result <10 && result >0){
            throw new Custom2Exception("This is Custom2 Exception");
        }
        System.out.println("Executed successfully");
    }
}
