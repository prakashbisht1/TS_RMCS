package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Properties;

/**
 * @author neeraj.agarwal
 *
 */
public class Property {

  //private static Properties property

  private static Properties loadProperties(String propertyFilePath) {
    Properties property = new Properties();
    try (FileInputStream input = new FileInputStream(propertyFilePath)) {
      property.load(input);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return property;
  }

  /**
   * This method is to get properties value from config file
   * @param key
   * @return
   */
  public static String getConfig(String key) {
    return loadProperties("resources/testdata/config.properties").getProperty(key).trim();
  }

}
