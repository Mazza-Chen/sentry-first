package com.example;

import java.lang.Exception;
import io.sentry.Sentry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
try {
  throw new Exception("This is a test.");
} catch (Exception e) {
  Sentry.captureException(e);
}

    }
}
