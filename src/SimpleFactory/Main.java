package SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args){
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader =new BufferedReader(inputStreamReader);
        try {
            System.out.println("输入数字A");
            Double numberA =Double.parseDouble(bufferedReader.readLine()) ;
            System.out.println("输入操作符 如 + - * / ");
            String operator = bufferedReader.readLine();
            System.out.println("输入数字B");
            Double numberB= Double.parseDouble(bufferedReader.readLine());
            Operation oper = OperationFactory.creatOperation(operator);
            oper.setNumberA(numberA);
            oper.setNumberB(numberB);
            System.out.println("结果是"+oper.getResult());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
