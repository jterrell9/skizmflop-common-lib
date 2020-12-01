package net.skizmflop.commons.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Population by State data
 * @author jack
 */
@Entity
@Table(name="state_population")
public class StatePopulation {
	
	/**
	 * <p>default no-args contructor for new Population by State.</p>
	 * <p>Sets id and name members to empty string.</p>
	 */
	public StatePopulation() {
		
	}
	
	
	/**
	 * <p>all-args constructor.</p>
	 * @param state 
	 * @param Population 
	 * @param censusYear
	 */
	public StatePopulation(State state, Long Population, Integer censusYear) {
		setState(state);
		setPopulation(population);
		setCensusYear(censusYear);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pop_id", nullable=false, unique=true, updatable=false)
	private Long popId;
	@Column(name="population", nullable=false)
	private Long population;
	@Column(name="census_year", nullable=false, length=4, updatable=false)
	private Integer censusYear;
	@Column(name="source", nullable=true, length=32, updatable=false)
	private String source;
	@ManyToOne(targetEntity=State.class)
	@JoinColumn(name="state_id", nullable=false, insertable=true)
	private State state;
	
	/**
	 * @return the popId
	 */
	public Long getPopId() {
		return popId;
	}
	/**
	 * @param popId the popId to set
	 */
	public void setPopId(Long popId) {
		this.popId = popId;
	}
	/**
	 * @return the population
	 */
	public Long getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(Long population) {
		this.population = population;
	}
	/**
	 * @return the censusYear
	 */
	public Integer getCensusYear() {
		return censusYear;
	}
	/**
	 * @param censusYear the censusYear to set
	 */
	public void setCensusYear(Integer censusYear) {
		this.censusYear = censusYear;
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

	@Override
	public String toString() {
		return "StatePopulation[popId=" + popId + ", population=" + population 
				+ ", censusYear=" + censusYear + ", state=" + state.getId() + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof StatePopulation)) return false;
		return this.getPopId() == ((StatePopulation) o).getPopId();
	}
	
	@Override
	public int hashCode() {
		return this.getPopulation().hashCode();
	}
}
