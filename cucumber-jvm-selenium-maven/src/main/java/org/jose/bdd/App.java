package org.jose.bdd;

/**
 * Hello world!
 *
 */
public class App
{
  private int result;
  
  public static void main( String[] args )
  {
    System.out.println( "Hello World!" );
  }

  public void add(int arg1, int arg2) {
    result = arg1 + arg2;
  }

  public int getResult() {
    return result;
  }

}
