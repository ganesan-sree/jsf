package com.concepts;

import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample{
  /* Get actual class name to be printed on */
  static Logger log = Logger.getLogger(
                      log4jExample.class);

  public static void main(String[] args)
                throws IOException,SQLException{
   
	  int i=0;
	  log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!"+i++);
      log.warn("Warn Message!"+i);
      log.error("Error Message!");
      log.fatal("Fatal Message!");
     System.out.println("1111");
     System.out.println(i);
  }
}
