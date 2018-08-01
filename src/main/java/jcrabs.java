package jcrabs;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;

import org.rev317.min.api.methods.Npcs;
import org.rev317.min.api.methods.Players;
import org.rev317.min.api.wrappers.Npc;

import java.util.ArrayList;


@ScriptManifest(author = "Jadsbutt", category = Category.COMBAT, description = "Jcrabs", name = "Jcrabs", servers = { "Runeunique" }, version = 1)
public class jcrabs extends Script{

    private final ArrayList<Strategy> strategies = new ArrayList<Strategy>();

    @Override
    public boolean onExecute() {
        strategies.add(new Attack());
        provide(strategies);
        return true;
    }
  
    
  //  public class Pickup implements Strategy {

    //	@Override
    //	public boolean activate() {
    	//	  GroundItem[] g = GroundItems.getNearest(12159, 12161, 12160);
    	//	  if (g.length > 0 && g[0].distanceTo() < 6) {
    	//	return true;
    	//	  }
    	//	  return false;
    	//}

    //	@Override
    	//public void execute() {
    		   //GroundItem[] g = GroundItems.getNearest(12159, 12161, 12160);
    		 
    	            //if (g.length > 0) {
    	            	
    	           //  g[0].take();
    	            // Time.sleep(100);
    		
    	
    	
    
    
    @Override
    public void onFinish() {

    }
    


  

    
    
    

    public class Attack implements Strategy {
        @Override
        public boolean activate() {
        	return  !Players.getMyPlayer().isInCombat();
        }

        @Override
        public void execute() {
        	Npc crab = Npcs.getClosest(1265);
        	
        	
        	if (crab != null) {
        		crab.interact(1);
        		Time.sleep(new SleepCondition(){ 
        			
        			public boolean isValid() { 
        				return Players.getMyPlayer().isInCombat();
        				}
        			}, 3215);		
        		}
        	}
        	
        	
        			 }
       
        	
    }