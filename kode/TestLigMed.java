public class TestLigMed
{

   public static void main(String[] args)
   {
      String s;
      s = "Ja da";
      if (s == "Ja da")
      {
         System.out.println("==Ja da");
      }
      
      s = "Ja";
      s += " ";
      s += "da";
      System.out.println("s: " + s);
      if (s == "Ja da")
      {
         System.out.println("konstrueret s == Ja da");
      }
      //prøv med equals
      if (s.equals("Ja da"))
      {
         System.out.println("s.equals(\"Ja da\")");
      }
      String s2 = "Ja da";
      if (!(s.equals(s2)))
      {
         System.out.println("not s.equals(s2)");
      }
      if (!(s == s2))
      {
         System.out.println("not s == s2");
      }
   }
}