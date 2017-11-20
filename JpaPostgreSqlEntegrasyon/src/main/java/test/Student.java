package test;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Student {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		@Column
		private String ad;
		
		@Column
		private String soyad;
		
		@Column
		private String ogrNo;

		@OneToMany(mappedBy="student")
		private List<Dersler> dersler;
		
		
		public List<Dersler> getDersler() {
			return dersler;
		}

		public void setDersler(List<Dersler> dersler) {
			this.dersler = dersler;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAd() {
			return ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public String getSoyad() {
			return soyad;
		}

		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}

		public String getOgrNo() {
			return ogrNo;
		}

		public void setOgrNo(String ogrNo) {
			this.ogrNo = ogrNo;
		}
	
}
