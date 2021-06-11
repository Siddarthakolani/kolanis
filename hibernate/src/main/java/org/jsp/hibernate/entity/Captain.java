package org.jsp.hibernate.entity;


	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import org.hibernate.annotations.GenericGenerator;

	@Entity
	@Table(name = "captain")
	public class Captain implements Serializable{
		@Id
		@GenericGenerator(name = "cap_auto", strategy = "increment")
		@GeneratedValue(generator = "cap_auto")
		@Column(name = "c_id")
		private Long cId;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "jersy_number")
		private String jersyNumber;
		
		@Column(name = "age")
		private Long age;
		
		@Column(name = "matches_played")
		private Long noMatchesPlayed;

		public Long getcId() {
			return cId;
		}

		public void setcId(Long cId) {
			this.cId = cId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getJersyNumber() {
			return jersyNumber;
		}

		public void setJersyNumber(String jersyNumber) {
			this.jersyNumber = jersyNumber;
		}

		public Long getAge() {
			return age;
		}

		public void setAge(Long age) {
			this.age = age;
		}

		public Long getNoMatchesPlayed() {
			return noMatchesPlayed;
		}

		public void setNoMatchesPlayed(Long noMatchesPlayed) {
			this.noMatchesPlayed = noMatchesPlayed;
		}

	}

}
