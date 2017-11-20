package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dersler {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String dersAdi;
	
	@Column
	private String kredi;

	public int getId() {
		return id;
	}

	@ManyToOne
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public String getKredi() {
		return kredi;
	}

	public void setKredi(String kredi) {
		this.kredi = kredi;
	}
	
	
	
}
