package net.skizmflop.commons.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

/**
 * US State Counties
 * @author jack
 */
@Entity
@Table(name="COUNTY")
public class County {

	@Id
	@Column(name="ID", nullable=false, length=2, unique=true, updatable=false)
	private String id;
	@Column(name="COUNTY_NAME", nullable=false, length=32, unique=true, updatable=false)
	private String countyName;
	@ManyToOne(targetEntity=State.class, optional=false)
	@JoinColumn(name="STATE_ID", nullable=false, insertable=true)
	private State state;
	@Column(name="COUNTY_POPULATION")
	private Long countyPopulation;
	@Column(name="COUNTY_SIZE")
	private Long countySize;
	
	/**
	 * <p>Generated ID</p>
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the countyName
	 */
	public String getCountyName() {
		return countyName;
	}
	/**
	 * @param countyName the countyName to set
	 */
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * @return the countyPopulation
	 */
	public Long getCountyPopulation() {
		return countyPopulation;
	}
	/**
	 * @param countyPopulation the countyPopulation to set
	 */
	public void setCountyPopulation(Long countyPopulation) {
		this.countyPopulation = countyPopulation;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof County)) return false;
		return this.getId() == ((County) o).getId();
	}
	
	@Override
	public int hashCode() {
		return this.getCountyName().hashCode();
	}
	
	
}
