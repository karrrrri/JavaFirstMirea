package ru.mirea.task24;

import java.util.regex.Pattern;

public class IP{
    public void check_ipv4(String task) {
        String ip = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";
        if(Pattern.matches(ip,task)) System.out.println("True");
        else System.out.println("False");
    }
}

class Test{
    public static void main(String[] args) {
        String r1, r2, r3, r4;
        r1 = "127.0.0.1";
        r2 = "255.255.255.0";
        r3 = "1300.6.7.8";
        r4 = "abc.def.gha.bcd";

        IP task = new IP();
        task.check_ipv4(r1);
        task.check_ipv4(r2);
        task.check_ipv4(r3);
        task.check_ipv4(r4);
    }
}