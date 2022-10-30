package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {//Her methoddan once calışır

        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);

            properties=new Properties();
            properties.load(fis);//fis'in okuduğu bilgileri properties'e yükledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){

        /*
        test methodundan yolladığımız String key değerini alıp
        Properties classından getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */
        return properties.getProperty(key);
    }
}
