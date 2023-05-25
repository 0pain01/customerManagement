package net.javaguides.sms.entity;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name")
	private String LastName;
	
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private long phoneNumber;
	
	@Column(name="address")
	private String address;
	
	@Temporal(TemporalType.DATE)
	@Column(name="register_date" ,nullable = false)
	private Date date;

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@PrePersist
	private void onCreate() {
		date = new Date();
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}
	
	public Customer() {
		
	}
	
	public Customer( String firstName, String lastName, String email,long phoneNumber, String address,Date date) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.date=date;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
