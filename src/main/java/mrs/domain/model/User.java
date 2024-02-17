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
    public String getUserId(){
        return userId;
    }
    public String getPassword(){
        return password;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public RoleName getRoleName(){
        return roleName;
    }
    public void setUserId(String userId) {
       this.userId = userId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }


}
