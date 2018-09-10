package Util;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by mdrahman on 9/8/18.
 * Spring 2018
 */
public class ConfigReader {

    private String URL;
    private String chromepath;
    private String os;
    private Properties prop = new Properties();
    private InputStream input;




    public ConfigReader() {
        try{
        input = new FileInputStream("Config.properties");
        prop.load(input);
        os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            this.chromepath = prop.getProperty("chromePath_mac");
        } else{
            this.chromepath = prop.getProperty("chromePath_win");
        }
        this.URL = prop.getProperty("url");
    }catch(IOException io ){
            io.printStackTrace();
        }
    }


    public String url() throws FileNotFoundException {
        return URL;
    }

    public String chromePath(){
        return chromepath;
    }


}