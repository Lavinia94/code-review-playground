package com.example.demo;

/**
 * Entry point of the demo application.
 */
public class Application {

  /**
   * Starts the application.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    System.out.println("Demo application started");
  }

  public static int x(int a) {
    if (a > 42) {
      return a * 3;
    }
    return a;
  }
}
