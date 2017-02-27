/*
27-02
Openlesdagen Leuven
Object Oriented Programming

*/
public class Person {
    
    public Person(Gender gender) throws IllegalGenderException{
        if(! checkGender(gender))
            throw new IllegalGenderException();
        this.gender = gender;
    }
     
    public Gender genderType{
        return this.gender;
    } 
     
    private final Gender gender; //Final, gender can't change + is private because we use getter instead of variable
    
    public boolean isMarried(){
        if (this.getSpouse() != null){
            
        }
    }
    
         
    public boolean checkGender(Gender gender){ 
        if(gender == 0)
            return false;
        return true;
    }
    
    public Person getSpouse(){
        return this.spouse;
    }
    
    public boolean canHaveAsSpouse(Person person){
        if(person == 0)
            return true; //You can be married to no one
        if(this.getGender() == person.getGender())
            return false;
        return true;
    }
    
    public boolean hasProperSpouse(){
        if(! canHaveAsSpouse(this.getSpouse()
            return false;
        else if (this.getSpouse() != null)
            return this.getSpouse().getSpouse == this;
        return true;
        
        
    }
    
    private Person spouse;
    
    public void marry(Person person) throws IllegalGenderException, NullPointerException, IllegalStateException{
        if(! canHaveAsSpouse(person))
            throw new IllegalGenderException();
        if(person == null)
            throw new NullPointerException();
        if (person.isMarried() || this.isMarried())
            throw new IllegalStateException();
        this.setSpouse(person);// Create the marriage
        person.setSpouse(this); //Idem
    }
    
    private void setSpouse(Person person){ //Cannot be public, otherwise it can be changed later
        this.spouse = person;
    } 
    
    
    
    public static void main(String[] args){
        
    }
    
    
    
    
}