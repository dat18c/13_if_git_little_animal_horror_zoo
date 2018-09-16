public class Equals
{

   public static void main(String[] args)
   {
      //går fint med == hvis de erklæres samtidigt
      sammenlign("a", "a");
      //kan ikke finde ud af at sammenligne, hvis objekterne laves forskelligt
      //== sammenligner ikke indhold - == sammenligner reference til objekterne
      String navn1 = "Asger";
      String navn2 = "As";
      navn2 = navn2 + "ger";
      sammenlign(navn1, navn2);
      //og så kan de virke igen, hvis samme tekststreng bruges
      //- compileren er god til at finde ud af at strengene er ens
      navn2 = "Asger";
      sammenlign(navn1, navn2);
   }

   public static void sammenlign(String s1, String s2)
   {
      //sammenlign med ==
      if (s1 == s2)
      {
         System.out.println("s1==s2");
      }
      else
      {
         System.out.println("!(s1==s2)");
      }
      //sammenlign med equals
      if (s1.equals(s2))
      {
         System.out.println("s1.equals(s2))");
      }
      else
      {
         System.out.println("!(s1.equals(s2))");
      }
   }
}