
public enum Gender {

    FEMALE {
        public char getSymbol(){
            return 'F'; //Get the female symbol
        }
        
    },
    
    MALE {
        public char getSymbol(){
            return 'M';
        }
    };


    public abstract char getSymbol();
    
    
    
    
    
}