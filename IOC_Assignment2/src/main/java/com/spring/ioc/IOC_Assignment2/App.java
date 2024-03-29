package com.spring.ioc.IOC_Assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.ioc.IOC_Assignment2.model.Country;
import com.spring.ioc.IOC_Assignment2.model.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	//adding two country
    	Country country1=context.getBean(Country.class);
    	country1.setCountryId("C001");
    	country1.setCountryName("India");
    	
    	
    	Country country2=context.getBean(Country.class);
    	country2.setCountryId("C002");
    	country2.setCountryName("Pakistan");
    	
    	//adding five player
    	
    	Player player1=context.getBean(Player.class);
    	player1.setPlayerId("P001");
    	player1.setPlayerName("atul patel");
    	player1.setCountry(country1);
    	
    	Player player2=context.getBean(Player.class);
    	player2.setPlayerId("P002");
    	player2.setPlayerName("rahul patel");
    	player2.setCountry(country1);
        
    	
    	Player player3=context.getBean(Player.class);
    	player3.setPlayerId("P003");
    	player3.setPlayerName("sachin singh");
    	player3.setCountry(country1);
        
    	
    	Player player4=context.getBean(Player.class);
    	player4.setPlayerId("P004");
    	player4.setPlayerName("ajay yadav");
    	player4.setCountry(country2);
        
    	
    	Player player5=context.getBean(Player.class);
    	player5.setPlayerId("P005");
    	player5.setPlayerName("mohit singh");
    	player5.setCountry(country2);
        
    	
    	List<Player> playerList =new ArrayList<>();
    	
    	playerList.add(player1);
    	playerList.add(player2);
    	playerList.add(player3);
    	playerList.add(player4);
    	playerList.add(player5);
    	
    	System.out.println(playerList);
    	
    	
    	//2 point work
    	
    	Map<String,List<Player>> map=new HashMap<>();
    	  
    	List<Player> indiaPlayers=new ArrayList<Player>();
    	List<Player> pakistanPlayers=new ArrayList<Player>();
    	map.put("India",indiaPlayers );
    	map.put("Pakistan",pakistanPlayers);
    	
    	for(Player p:playerList)
    	{
    		if(p.getCountry().getCountryName().equals("India"))
    		{
    		     indiaPlayers.add(p);      
    		}
    		else {
				pakistanPlayers.add(p);
			}
    		
    	}
    	
    	//All player detail having India as country
    	System.out.println(map.get("India"));
    	
    	//All player detail having Pakistan as country
      	System.out.println(map.get("Pakistan"));
    	
    
    }
}
