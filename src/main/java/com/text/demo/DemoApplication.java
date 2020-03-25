package com.text.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static class Test1 {
        public static void main(String[] args){
            for(int i=1;i<=9;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+"*"+i+"="+i*j+'\t');
                }
                System.out.println();
            }
        }
    }
}
