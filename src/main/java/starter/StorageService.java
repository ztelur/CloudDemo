package starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * Created by homer on 17-9-5.
 */
public class StorageService {
    private Logger logger = LoggerFactory.getLogger(StorageService.class);
    private String url;
    private String username;
    private String password;
    private HashMap<String, Object> storage = new HashMap<String, Object>();
    public StorageService(StorageServiceProperties properties) {
        super();
        this.url = properties.getUrl();
        this.username = properties.getUsername();
        this.password = properties.getPassword();
        logger.debug("init storage with url " + url + " name: " + username + " password: " + password);
    }


    public void put(String key, Object val) {
        storage.put(key, val);
    }

    public Object  get(String key) {
        return storage.get(key);
    }
}
