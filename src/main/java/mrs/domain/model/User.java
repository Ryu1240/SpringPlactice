package mrs.domain.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "usr")
public class User implements Serializable {
    @Id
    private String userId;

    private String password;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    //Getter
    public String GetUserId(){
        return userId;
    }
    public String GetPassword(){
        return password;
    }

    public String GetFirstName(){
        return firstName;
    }
    public String GetLastName(){
        return lastName;
    }
    
    public RoleName GetRoleName(){
        return roleName;
    }


}
