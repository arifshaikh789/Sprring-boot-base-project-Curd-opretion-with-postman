package springbootPackage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class UserModel 
{   
	@Id
 	 @Column(name="id")
     private int id;
     
	 @Column(name="Email")
	 private String Email;
	 
	 @Column(name="password")
	 private String password;
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 
}
