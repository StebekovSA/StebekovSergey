package units;

public class Farmer extends Units {
   protected int resources;

   public Farmer(String name, int resources) {
      super(name);
      this.resources = resources;
   }

      public void Collect(Pets ...addRes) {
         for (int i = 0; i < addRes.length; i++) {
            if (addRes[i] != null) {
               this.resources += addRes[i].resources;
            }
         }
      }


}
