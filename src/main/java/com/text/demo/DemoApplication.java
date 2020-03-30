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
    public static  class  test2{
        public static void main(String[] args){
            for(int i=1;i<=9;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+"*"+i+"="+i*j+'\t');
                }
                System.out.println();
            }
        }

    }
    public static  class  test3{
        public static void main(String[] args){
            System.out.println("酒后少女的梦");
        }

    }
    public  static class  test4{
        public static void main(String[] args) {
            System.out.println("可可");
            System.out.println("九亿少女的梦");
        }
    }
}
