package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    static {

        String path = "configuration.properties";

        try {

            FileInputStream file = new FileInputStream(path);

            properties = new Properties();
            properties.load(file);

            file.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String getProperty(String key){
        return properties.getProperty(key);
    }


//    @Test
//    public void test1(){
//        System.out.println(getProperty("google_url")); //https://www.google.com
//        System.out.println(getProperty("test_environment")); //UAT
//        System.out.println(getProperty("url")); //null
//    }

}

