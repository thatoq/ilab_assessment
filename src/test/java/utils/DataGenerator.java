package utils;

import java.util.Random;

public class DataGenerator {

    public  static String PhoneNumber()
    {
        Random random=new Random();
        String code="073";
        int num1=random.nextInt(999);
        int numb2=random.nextInt(10000);
        String phone=code+" "+num1+" "+numb2;
        return phone;
    }
}
