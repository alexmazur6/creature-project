public class Creature {
	private int strength;
   private int hitPoints;
   private String name;
   private String species;
   
   public String getSpecies() {
      return species;
   }
   
   public Creature(String newName, String newSpecies, int newStrength, int newHit) throws exception {
      strength = newStrength;
      hitPoints = newHit;
      name = newName;
      species = newSpecies;
   }
   
   public void setStrength(int newStrength) throws exception {
      strength = newStrength;
   }
   
   public int getStrength() {
      return strength;
   }
   
   public void setHitPoints(int newHit) throws exception {
      hitPoints = newHit;
   }
   
   public int getHitPoints() {
      return hitPoints;
   }
   
   public int getDamage() {
      int damage = 1 + (int)(Math.random() * hitPoints);
      if (species.equals("Balrog") || species.equals("Cyberdemon")) {
         double critChance = Math.random();
         if (critChance < 0.05) {
            damage = damage + 50;
         }
      }
      else if (species.equals("Elves")) {
         double chance = Math.random();
         if (chance < 0.1) {
            return = damage + damage;
         }
      }
      
      else if (species.equals("Balrog")) {
         int damage2 = 1 + (int)(Math.random() * hitPoints);
         return = damage + damage2;
      }
      else {
         return damage;
      }         
   }
   
   public void Damage(int damage) throws exception {
      //TODO
   }
   
   public boolean isDead() {
      //TODO
   }
   
   public String getName() {
      return name;
   }
   
   public boolean isNamed(String aName) {
      if (name.equals(aName))
         return true;
      else
         return false;
   }
   
}