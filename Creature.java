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
      //placeholder
   }
   
   public void Damage(int damage) throws exception {
   }
   
   public boolean isDead() {
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