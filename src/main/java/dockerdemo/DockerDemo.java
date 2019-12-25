/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dockerdemo;

import java.util.Properties;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aallagul
 */
public class DockerDemo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    System.out.println("=== Hello from DockerPublic Image === [1]");
    /*
    if (args.length == 0) {
      System.out.println("Empty args list");
    } else {
      System.out.println("args.length = " + args.length);
      for (String arg : args) {
        System.out.println(arg);
      }
    }
    */
    //Properties p = System.getProperties();
    //for (String key : p.stringPropertyNames()) {
    //  System.out.println(key + " = " + p.getProperty(key));
    //}

    System.out.println("affiliate = " + System.getenv("affiliate"));
    System.out.println("ds = " + System.getenv("ds"));
    System.out.println("java.version = " + System.getProperty("java.version"));

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    LocalDateTime date = LocalDateTime.now();

    for (int i = 0; i < 100000; i++) {
      date = LocalDateTime.now();
      System.out.println("i = " + i + " " + formatter.format(date));
      Thread.sleep(5000L);
      //break;
    }
    System.out.println("=============================== [2]");
  }
}
