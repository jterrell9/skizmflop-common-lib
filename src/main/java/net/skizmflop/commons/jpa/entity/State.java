package net.skizmflop.commons.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

/**
 * US States
 * @author jack
 */
@Entity
@Table(name="US_STATES")
public class State {
	
	/**
	 * <p>default no-args contructor for new State.</p>
	 * <p>Sets id and name members to empty string.</p>
	 */
	public State() {
		this.id = StringUtils.EMPTY;
		this.name = StringUtils.EMPTY;
	}
	
	/**
	 * <p>Constuctor for just state ID.</p>
	 * @param id
	 */
	public State(String id) {
		setId(id);
	}
	
	/**
	 * <p>all-args constructor for new State.</p>
	 * @param id
	 * @param name
	 */
	public State(String id, String name) {
		setId(id);
		setName(name);
	}

	@Id
	@Column(name="ID", nullable=false, length=2, unique=true, updatable=false)
	private String id;
	@Column(name="NAME", nullable=false, length=32, unique=true, updatable=false)
	private String name;
	
	/**
	 * <p>State's Post Office code.</p>
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id.toUpperCase();
	}
	
	/**
	 * <p>State's name.</p>
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "State[id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof State)) return false;
		return StringUtils.equals(this.getId(), ((State) o).getId());
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	
}
