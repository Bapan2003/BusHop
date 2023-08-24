package com.example.BusHop.Models;




import jakarta.persistence.*;

@Entity
@Table
public class User {
	    @Id
	    private Long userId;
	    private String userName;
	    private String userEmail;
	    private String userPassword;
	    private String age;
	    private String gender;
//	    @OneToMany(cascade = CascadeType.ALL)
//	    private List<Reservation> reservationList = new ArrayList<>();
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long userId, String userName, String userEmail, String userPassword, String age, String gender) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userEmail = userEmail;
			this.userPassword = userPassword;
			this.age = age;
			this.gender = gender;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
	    
	    
	    
}
