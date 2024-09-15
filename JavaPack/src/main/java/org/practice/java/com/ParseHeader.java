package org.practice.java.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseHeader {

    public static List<String> parseIpHeader(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String headLine = sc.nextLine();
        String sIp = sc.nextLine();
        String dIp = sc.nextLine();

        List<String> result  = new ArrayList<String>();

        int ipV  = binaryToDecimal(Integer.parseInt(headLine.substring(0,4)));
        int protocolValue = binaryToDecimal(Integer.parseInt(headLine.substring(4, 12)));
        int timeToLive = binaryToDecimal(Integer.parseInt(headLine.substring(13, 20)));
        int packlength =  binaryToDecimal(Integer.parseInt(headLine.substring(20, 32)));

        String protocol  = protocolValue == 6 ? "TCP" : protocolValue == 17 ? "UDP" : null;

        result.add(ipV + "," + protocol + "," + timeToLive + "," + packlength);
        result.add(createIp(sIp));
        result.add(createIp(dIp));
        return result;
    }

    private static String createIp(String sIp) {
        return getIntIp(sIp, 0, 8) + "."  + getIntIp(sIp, 8, 16)
                + "." + getIntIp(sIp, 16, 24) + "." + getIntIp(sIp, 24, 32);
    }

    private static int getIntIp(String sIp, int s, int e) {
        return binaryToDecimal(Integer.parseInt(sIp.substring(s, e)));
    }


    private static int binaryToDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
