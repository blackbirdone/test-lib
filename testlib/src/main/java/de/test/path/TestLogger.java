package de.test.path;

/**
 * TODO: DESC CLASS
 *
 * @author LarsG
 */
public class TestLogger {
  public void log(String string) {
    System.out.println("MESSAGE FROM TestLogger " + string);
  }

  public static void main(String[] args) {
    System.out.println(System.getenv("TESTVARIABLE"));
  }
}