package org.jsp.hibernate.entity;

	import java.io.Serializable;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	import javax.persistence.PrimaryKeyJoinColumn;
	import javax.persistence.Table;

	import org.hibernate.annotations.GenericGenerator;

	@Entity
	@Table(name = "team")
	public class Team implements Serializable{
		
		@Id
		@GenericGenerator(name = "team_auto", strategy = "increment")
		@GeneratedValue(generator = "team_auto")
		@Column(name = "t_id")
		private Long tId;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "no_of_players")
		private Long noOfPlayers;
		
		@Column(name = "country")
		private String  country;
		
		@Column(name = "type")
		private String  type;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "fr_id")
		private Captain captain;
		
		public Long gettId() {
			return tId;
		}
		public void settId(Long tId) {
			this.tId = tId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getNoOfPlayers() {
			return noOfPlayers;
		}
		public void setNoOfPlayers(Long noOfPlayers) {
			this.noOfPlayers = noOfPlayers;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Captain getCaptain() {
			return captain;
		}
		public void setCaptain(Captain captain) {
			this.captain = captain;
		}
		
		
	}

