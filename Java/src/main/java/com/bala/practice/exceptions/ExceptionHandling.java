package com.bala.practice.exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {


        try {
            callingMethod();
        } catch (CustomException e) {
            //throw new RuntimeException(e);
            System.out.println("CustomException happened: "+e.getMessage());
            e.printStackTrace();
        }catch (Custom2Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Custom2Exception happened: "+e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            //

        }


    }

    public static void callingMethod() throws Exception {

        executingMethod(1000,10);
    }

    public static void executingMethod(int number1, int number2)
            throws  Custom2Exception{

        int result = number1/number2;
        if(result >10){
            throw new RuntimeException("This is Custom Exception");
        }
        if(result <10 && result >0){
            throw new Custom2Exception("This is Custom2 Exception");
        }
        System.out.println("Executed successfully");
    }
}
