package jon.jwtsecurity.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequestModel  {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }
}
