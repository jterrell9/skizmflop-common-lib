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
 * Electoral Votes
 * @author jack
 */
@Entity
@Table(name="electoral_college")
public class ElectoralCollege {
	
	/**
	 * <p>default no-args contructor for new State.</p>
	 * <p>Sets id and name members to empty string.</p>
	 */
	public ElectoralCollege() {
		
	}
	
	
	/**
	 * <p>all-args constructor.</p>
	 * @param state 
	 * @param electoralVotes
	 * @param electionYear
	 */
	public ElectoralCollege(State state, Integer electoralVotes, Integer electionYear) {
		setState(state);
		setElectoralVotes(electoralVotes);
		setElectionYear(electionYear);
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false, unique=true, updatable=false)
	private Long id;
	@Column(name="electoral_votes", nullable=false)
	private Integer electoralVotes;
	@Column(name="election_year", nullable=false, length=4, updatable=false)
	private Integer electionYear;
	@ManyToOne(targetEntity=State.class)
	@JoinColumn(name="state_id", nullable=false, insertable=true)
	private State state;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the electoralVotes
	 */
	public Integer getElectoralVotes() {
		return electoralVotes;
	}

	/**
	 * @param electoralVotes the electoralVotes to set
	 */
	public void setElectoralVotes(Integer electoralVotes) {
		this.electoralVotes = electoralVotes;
	}

	/**
	 * @return the electionYear
	 */
	public Integer getElectionYear() {
		return electionYear;
	}

	/**
	 * @param electionYear the electionYear to set
	 */
	public void setElectionYear(Integer electionYear) {
		this.electionYear = electionYear;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "ElectoralCollege[id=" + id + ", electoralVotes=" + electoralVotes 
				+ ", electionYear=" + electionYear + ", state=" + state.getId() + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof ElectoralCollege)) return false;
		return this.getId() == ((ElectoralCollege) o).getId();
	}
	
	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
}
