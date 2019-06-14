package internship.andersenlab.client.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

    @Column(name ="username")
   private long userName;

   @Column(name = "password")
   private String password;

   @Column(name  ="email")
    private String email;

   @Column(name ="enabled")
    private short enabled;

   @Column(name = "account_non_expired")
    private short accountNonExpired;

   @Column(name = "credentials_non_expired")
   private short credentialsNonExpired;

   @Column(name = "account_non_locked")
    private short accountNonLocked;
}
