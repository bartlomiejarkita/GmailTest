package properties_operations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyValues {

    String propertyFileName = "config.properties";
    InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);
    Properties property = new Properties();


    public void setInputStream () throws IOException {
        if (inputStream != null) {
            property.load(inputStream);
        } else {
            throw new FileNotFoundException(
                    "Properties file '" + propertyFileName + "' not found in the classpath.");
        }

        inputStream.close();
    }

    public String getABTestingString() throws IOException {
        setInputStream();
        return property.getProperty("a_b_testing_string");
    }

    public String getLoginSuccessfulString() throws IOException {
        setInputStream();
        return property.getProperty("login_successful_string");
    }

    public String getLoginCancelledString() throws IOException {
        setInputStream();
        return property.getProperty("login_cancelled_string");
    }

}
