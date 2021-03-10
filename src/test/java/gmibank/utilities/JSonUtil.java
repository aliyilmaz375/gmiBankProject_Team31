package gmibank.utilities;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JSonUtil {

    // ObjectMapper kullanarak De-Sterilization yapma metodu

    private static ObjectMapper mapper;

    static {
        mapper =  new ObjectMapper();
    }

    // Methodumuzu olusturacagız - JSon Datasını Java Object sıne donusturecek

    public static <T> T convertJsonToJava(String json,Class<T> cls){
        T javaResult = null;
        try {
            javaResult= mapper.readValue(json, cls);
        } catch (IOException e) {
            System.err.println("Json Datasını Java'ya donusturemedi"+ e.getMessage());
        }

        return javaResult;
    }
}
