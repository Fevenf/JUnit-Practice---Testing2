package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.ByteArrayInputStream;

class Testing {

    @Test
    @DisplayName("Can be added")
    void canBeAdded(){
        assertEquals(30, Addition.addition(20,10));  
    }

    @Test
    @DisplayName("Can be multiplication")
    void canBeMultiplication(){
        assertEquals(200, Multiplication.multiplication(20,10));  
    }

    @Test
    @DisplayName("Show Modules")
    void canShowModules(){
        assertEquals(0, Modules.modules(20,10));  
    }
    @Test
    @DisplayName("Can't be added")
    void canotBeAdded(){
        assertNotEquals(20, Addition.addition(20,10)); 
    }

    @Test
    @DisplayName("Can be divided")
    void canBeDivided(){
        assertEquals(10, Division.division(100,10));  
    }
   
    @Test
    @DisplayName("Can be subtracted")
    void canBeSubtracted(){
        assertEquals(70, Subtraction.subtraction(100,30));  
    }

    @Test
    @DisplayName("Average")
    void itsAverage(){
        assertEquals(50, Average.average(50,50));  
    }

    @DisplayName("Test hiFriend() method")
    @Test
    void testHiFriend() {
        assertEquals("Hi Feven!", HiFriend.hiFriend("Feven"));
    }

    @DisplayName("Water is boiling")
    @Test
    void testWater() {
        assertEquals("Water is boiling", BoilingWater.checkWaterTemp(240));
    }

    @Test
    @DisplayName("Grade test")
    void fiftyNineShouldReturnF() throws IllegalAccessException{
        assertEquals('F', TestScore.testScore(59));
      }

      @Test
      void getDogName() {
          Animal animal = new Animal("Anbesaw");
          assertEquals("Anbesaw", animal.getName());
      }

     

       
}