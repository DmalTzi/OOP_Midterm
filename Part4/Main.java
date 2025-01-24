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
            if (npc instanceof Fisherman) {
                Fisherman newnpc = (Fisherman) npc;
                newnpc.fishing();
            }else if (npc instanceof Butcher) {
                Butcher newnpc = (Butcher) npc;
                newnpc.cutting();
            }else if (npc instanceof Toolsmith) {
                Toolsmith newnpc = (Toolsmith) npc;
                newnpc.crafting();
            }else if (npc instanceof Armorer) {
                Armorer newnpc = (Armorer) npc;
                newnpc.crafting();
            }else if (npc instanceof Farmer) {
                Farmer newnpc = (Farmer) npc;
                newnpc.farming();
            }else {
                System.out.println("Sorry I am useless");
            }
       }
    }

}
