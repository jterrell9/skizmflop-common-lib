package net.skizmflop.commons.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.skizmflop.commons.constants.USStates;
import net.skizmflop.commons.jpa.entity.ElectoralCollege;
import net.skizmflop.commons.jpa.entity.State;
import net.skizmflop.commons.jpa.entity.StatePopulation;

/**
 * <p>Utility for populating data.</p>
 * @author jack
 */
public class DataPopulator implements USStates {
	
	/**
	 * <p>Add population to a list of states in the console.</p>
	 * @param states
	 * @param censusYear
	 * @return
	 */
	public static List<StatePopulation> addPopulation(List<State> states, Integer censusYear) {
		List<StatePopulation> statePopulations = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for(State state: states) {
			System.out.printf("Enter population of %s: ", state.getName());
			statePopulations.add(new StatePopulation(state, scanner.nextLong(), censusYear));
			System.out.print('\n');
		}
		scanner.close();
		return statePopulations;
	}
	
	/**
	 * <p>Generates a list of electoral data to insert into DB.</p>
	 * @return List of ElectoralCollege entries
	 */
	public static List<ElectoralCollege> populate2020ElectoralData() {
		List<ElectoralCollege> electoralCollege = new ArrayList<>();
		electoralCollege.add(new ElectoralCollege(AK, 3,2020));
		electoralCollege.add(new ElectoralCollege(HI, 4,2020));
		electoralCollege.add(new ElectoralCollege(AL, 9,2020));
		electoralCollege.add(new ElectoralCollege(AR, 6,2020));
		electoralCollege.add(new ElectoralCollege(AZ, 11,2020));
		electoralCollege.add(new ElectoralCollege(CA, 55,2020));
		electoralCollege.add(new ElectoralCollege(CO, 9,2020));
		electoralCollege.add(new ElectoralCollege(CT, 7,2020));
		electoralCollege.add(new ElectoralCollege(DE, 3,2020));
		electoralCollege.add(new ElectoralCollege(FL, 29,2020));
		electoralCollege.add(new ElectoralCollege(GA, 16,2020));
		electoralCollege.add(new ElectoralCollege(IA, 6,2020));
		electoralCollege.add(new ElectoralCollege(ID, 4,2020));
		electoralCollege.add(new ElectoralCollege(IL, 20,2020));
		electoralCollege.add(new ElectoralCollege(IN, 11,2020));
		electoralCollege.add(new ElectoralCollege(KS, 6,2020));
		electoralCollege.add(new ElectoralCollege(KY, 8,2020));
		electoralCollege.add(new ElectoralCollege(LA, 8,2020));
		electoralCollege.add(new ElectoralCollege(MA, 11,2020));
		electoralCollege.add(new ElectoralCollege(MD, 10,2020));
		electoralCollege.add(new ElectoralCollege(ME, 4,2020));
		electoralCollege.add(new ElectoralCollege(MI, 16,2020));
		electoralCollege.add(new ElectoralCollege(MN, 10,2020));
		electoralCollege.add(new ElectoralCollege(MO, 10,2020));
		electoralCollege.add(new ElectoralCollege(MS, 6,2020));
		electoralCollege.add(new ElectoralCollege(MT, 3,2020));
		electoralCollege.add(new ElectoralCollege(NC, 15,2020));
		electoralCollege.add(new ElectoralCollege(ND, 3,2020));
		electoralCollege.add(new ElectoralCollege(NE, 5,2020));
		electoralCollege.add(new ElectoralCollege(NH, 4,2020));
		electoralCollege.add(new ElectoralCollege(NJ, 14,2020));
		electoralCollege.add(new ElectoralCollege(NM, 5,2020));
		electoralCollege.add(new ElectoralCollege(NV, 6,2020));
		electoralCollege.add(new ElectoralCollege(NY, 29,2020));
		electoralCollege.add(new ElectoralCollege(OH, 18,2020));
		electoralCollege.add(new ElectoralCollege(OK, 7,2020));
		electoralCollege.add(new ElectoralCollege(OR, 7,2020));
		electoralCollege.add(new ElectoralCollege(PA, 20,2020));
		electoralCollege.add(new ElectoralCollege(RI, 4,2020));
		electoralCollege.add(new ElectoralCollege(SC, 9,2020));
		electoralCollege.add(new ElectoralCollege(SD, 3,2020));
		electoralCollege.add(new ElectoralCollege(TN, 11,2020));
		electoralCollege.add(new ElectoralCollege(TX, 38,2020));
		electoralCollege.add(new ElectoralCollege(UT, 6,2020));
		electoralCollege.add(new ElectoralCollege(VA, 13,2020));
		electoralCollege.add(new ElectoralCollege(VT, 3,2020));
		electoralCollege.add(new ElectoralCollege(WA, 12,2020));
		electoralCollege.add(new ElectoralCollege(WI, 10,2020));
		electoralCollege.add(new ElectoralCollege(WV, 5,2020));
		electoralCollege.add(new ElectoralCollege(WY, 3,2020));
		electoralCollege.add(new ElectoralCollege(DC, 3,2020));
		return electoralCollege;
	}
	
	/**
	 * <p>Create a list of US States.</p>
	 * @return List of State objects
	 */
	public static List<State> getUSStates() {
		List<State> states = new ArrayList<>();
		new State("AK", "Alaska");
		new State("HI", "Hawaii");
		new State("AL", "Alabama");
		new State("AR", "Arkansas");
		new State("AZ", "Arizona");
		new State("CA", "California");
		new State("CO", "Colorado");
		new State("CT", "Connecticut");
		new State("DE", "Delaware");
		new State("FL", "Florida");
		new State("GA", "Georgia");
		new State("IA", "Iowa");
		new State("ID", "Idaho");
		new State("IL", "Illinois");
		new State("IN", "Indiana");
		new State("KS", "Kansas");
		new State("KY", "Kentucky");
		new State("LA", "Louisiana");
		new State("MA", "Massachusetts");
		new State("MD", "Maryland");
		new State("ME", "Maine");
		new State("MI", "Michigan");
		new State("MN", "Minnesota");
		new State("MO", "Missouri");
		new State("MS", "Mississippi");
		new State("MT", "Montana");
		new State("NC", "North Carolina");
		new State("ND", "North Dakota");
		new State("NE", "Nebraska");
		new State("NH", "New Hampshire");
		new State("NJ", "New Jersey");
		new State("NM", "New Mexico");
		new State("NV", "Nevada");
		new State("NY", "New York");
		new State("OH", "Ohio");
		new State("OK", "Oklahoma");
		new State("OR", "Oregon");
		new State("PA", "Pennsylvania");
		new State("RI", "Rhode Island");
		new State("SC", "South Carolina");
		new State("SD", "South Dakota");
		new State("TN", "Tennessee");
		new State("TX", "Texas");
		new State("UT", "Utah");
		new State("VA", "Virginia");
		new State("VT", "Vermont");
		new State("WA", "Washington");
		new State("WI", "Wisconsin");
		new State("WV", "West Virginia");
		new State("WY", "Wyoming");
		new State("DC", "District of Columbia");
		return states;
	}
	
	/**
	 * <p>Do not instantiate this util class</p>
	 */
	public DataPopulator() {
		throw new IllegalStateException("No instantiation is needed for util classes");
	}

}
