package com.example2.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	@Column(name="user_id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Adress address;

	public User(int id, String username, Adress address) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
}

