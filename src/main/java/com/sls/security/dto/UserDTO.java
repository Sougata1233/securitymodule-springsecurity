package com.sls.security.dto;

public class UserDTO {

	private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Long isEnabled;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Long isEnabled) {
		this.isEnabled = isEnabled;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", email=" + email + ", isEnabled=" + isEnabled + "]";
	}
	public UserDTO(Long id, String userName, String firstName, String lastName, String password, String email,
			Long isEnabled) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.isEnabled = isEnabled;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
    
}
