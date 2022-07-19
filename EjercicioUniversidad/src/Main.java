public class Main {

   public static void Main(String[] args) {
      Alumno alumno = new Alumno("Pablo", "Perez", "11111");
      Final final1 = new Final(alumno, "Objetos1"); // colocar los atriutal tal cual como el constructor
      Final final2 = new Final(alumno, "Testing");
      if (final1.compareTo(final2) == 1)
         System.out.println("Le fue mejor en objetos, es mayor");
   }


}