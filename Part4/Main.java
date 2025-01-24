import java.util.ArrayList;
import packMC.*;

public class Main {
    public static void main(String args[]) {
       ArrayList<NPC> NPCs = new ArrayList<>();
       NPCs.add(new Armorer());
       NPCs.add(new Armorer());
       NPCs.add(new Toolsmith());
       NPCs.add(new Farmer());
       NPCs.add(new Fisherman());
       NPCs.add(new Butcher());
       NPCs.add(new Farmer());
       NPCs.add(new NPC());
    
       for (NPC npc : NPCs) {
            System.out.println("====================");
            System.out.println(npc.getClass().getSimpleName());
            npc.work();
            // Your Work Start Here
            //
            else {
                System.out.println("Sorry I am useless");
            }
       }
    }

}
