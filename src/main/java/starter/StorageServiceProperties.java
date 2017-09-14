package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by homer on 17-9-5.
 */
@ConfigurationProperties("storage.service")
public class StorageServiceProperties {
    private String username;
    private String password;
    private String url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
