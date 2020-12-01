package net.skizmflop.commons.interfaces;

import java.util.List;

/**
 * <p>Interface for Data Access Services.</p>
 * @author jack
 * @param <T1> Entity class
 * @param <T2> ID class type
 */
public interface IDataAccessService<T1,T2> {
	
	/**
	 * @param id
	 * @return
	 */
	public T1 findById(T2 id);
	
	/**
	 * @return
	 */
	public List<T1> findAll();
	
	
	/**
	 * @param state
	 * @return
	 */
	public T1 save(T1 state);
	
	
	/**
	 * @param state
	 * @return
	 */
	public List<T1> save(List<T1> state);
	
	/**
	 * @return number of states
	 */
	public Long count();

}
