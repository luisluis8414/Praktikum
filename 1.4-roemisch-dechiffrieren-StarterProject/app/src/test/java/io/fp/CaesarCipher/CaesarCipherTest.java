package io.fp.CaesarCipher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import io.fp.caesarCipher.CaesarCipher;

public class CaesarCipherTest {

   @Test
   void testChipher() 
   {
      try{
      assertEquals("def",CaesarCipher.cipher("abc", 3));
      }catch(Exception e){
         System.out.println(e.getMessage());
      }
   }
   @Test
   void testDechipher()
   {
      try{
         assertEquals("abc",CaesarCipher.decipher("def", 3));
         }catch(Exception e){
            System.out.println(e.getMessage());
         }
   }
   @Test
   void testChipherWithEmptyString()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.cipher("",3);});
   }

   @Test
   void testDechipherWithEmptyString()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.decipher("",3);});
   }

   @Test
   void testChipherWithWrongKey()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.cipher("abc",27);});  
      assertThrows(Exception.class, ()->{CaesarCipher.cipher("abc",0);});      
   }

   @Test
   void testDechipherWithWrongKey()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.decipher("abc",27);});  
      assertThrows(Exception.class, ()->{CaesarCipher.decipher("abc",0);});      
   }

   @Test
   void testChipherWithCapitalLetter()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.cipher("ABC",24);});  

   }

   @Test
   void testDechipherWithCapitalLetter()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.decipher("ABC",24);});  

   }

   @Test
   void testCheckChipherPropsZeroKey()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.checkCipherProps("abc", 0);});  

   }
   @Test
   void testCheckChipherPropsEmptyString()
   {
      assertThrows(Exception.class, ()->{CaesarCipher.checkCipherProps("", 2);});  

   }

}
