package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String lastName; 
    private String avatar;
    private String nickname;
    private String company;
    private String jobTitle;
    private String email;
    private String phone;
    private String address;
    private String birthday;
    private String notes;
  
    public Employee() {}

   

    public Employee(Long id, String name, String lastName, String avatar, String nickname, String company,
			String jobTitle, String email, String phone, String address, String birthday, String notes) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.avatar = avatar;
		this.nickname = nickname;
		this.company = company;
		this.jobTitle = jobTitle;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", avatar=" + avatar + ", nickname="
				+ nickname + ", company=" + company + ", jobTitle=" + jobTitle + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getLastName()=" + getLastName() + ", getAvatar()=" + getAvatar()
				+ ", getNickname()=" + getNickname() + ", getCompany()=" + getCompany() + ", getJobTitle()="
				+ getJobTitle() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getAddress()="
				+ getAddress() + ", getBirthday()=" + getBirthday() + ", getNotes()=" + getNotes() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
    
}
