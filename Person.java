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
    
    public void terminate(){
        divorce(); //Remove all associatons with the object
        this.isTerminated = true;
    }
    
    public boolean isTerminated(){
        return this.isTerminated;
    }
     
    public Gender genderType{
        return this.gender;
    } 
     
    private boolean isTerminated;
    private final Gender gender; //Final, gender can't change + is private because we use getter instead of variable
    
    public boolean isMarried(){
        if (this.getSpouse() != null)
            return true;
        return false;
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
        if(this.isTerminated() || person.isTerminated())
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
    
   /* private void divorce(Person person) throw IllegalStateExcepkul tion, NullPointerException {  //Jerne Code, should not include Person person
        /*if(!person.isMarried())
            throw new IllegalStateException;
        if(this.getSpouse == null)
            throw new NullPointerException;
        
        this.setSpouse(null);
        person.setSpouse(null);
    }
    */
    
    private void divorce() { //Class code
        if(this.isMarried()){
            this.getSpouse().setSpouse(null); //We first get our spouse, set it to null
            this.setSpouse(null); //Then we set our own spouse to null
        }
    }
    
    private void setSpouse(Person person){ //Cannot be public, otherwise it can be changed later
        this.spouse = person;
    } 
    
    
    
    public static void main(String[] args){
        
    }
    
    
    
    
}