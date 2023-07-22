package pattern.bridge;

public abstract class Stationery {
   protected Color color;

   protected Stationery(Color color) {
      this.color = color;
   }

   abstract void write();

}
