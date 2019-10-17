package Practice_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World_map {

	
	public static void main(String[] args) {
		
	
	List<String> city1=new ArrayList<String>();
	
				city1.add("Amravati");
				city1.add("Pune");
				
	List<String> city2=new ArrayList<String>();
					
				city2.add("banglore");
				city2.add("maisur");
				
	List<List<String>> state1=new ArrayList<>();
	
						state1.add(city1);
						state1.add(city2);
						
						
	List<List<List<String>>> india=new ArrayList<>();
						
						india.add(state1);
						
						
						List<String> city3=new ArrayList<>();
									city3.add("lossengel");
									city3.add("toren");
									
						List<String> city4=new ArrayList<>();
									city4.add("Novel");
									city4.add("bavel");
									
						List<List<String>> state2=new ArrayList<>();
						
											state2.add(city3);
											state2.add(city4);
											
						List<List<List<String>>> usa=new ArrayList<>();
											
											usa.add(state2);					
							
								Map<String, List<List<List<String>>>>	world=new HashMap<>();
								
												world.put("india", india);
												world.put("usa", usa);
												
												Set<String> keys1=world.keySet();
												
												System.out.println("-Countrys are--"+keys1+"---");
								
												Iterator<String> itr1=keys1.iterator();
								
												while(itr1.hasNext())
												{
													String key=itr1.next();
									
													List<List<List<String>>> country=world.get(key);
														
																										
													Iterator<List<List<String>>> itr2=country.iterator();
													
													while(itr2.hasNext())
													{
														List<List<String>> state=itr2.next();
														
														System.out.println("---"+state+"---");
														
														Iterator<List<String>> itr3=state.iterator();
														
														while(itr3.hasNext())
														{
															List<String> city=itr3.next();
															
															System.out.println("---"+city+"---");
														}
													}
												}
								
	
	
	
	
	
	
	
	
	
	}
	
}
