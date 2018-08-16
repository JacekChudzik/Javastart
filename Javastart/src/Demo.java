
public class Demo {

	
	String firstName;
    String lastName;
 
    public Demo(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    @Override
    public boolean equals(Object obj) {
        // sprawdzenie równości fizycznej za pomocą ==
        if (this == obj)
            return true;
        // sprawdzamy, czy nie null
        if (obj == null)
            return false;
 
        // sprawdzamy, czy przekazany argument jest typu Student
        if (!(obj instanceof Demo))
            return false;
        //rzutowanie na odpowiedni typ
        Demo s = (Demo) obj;
         
        // sprawdzenie kolejnych pól klasy, uważając na wartości null
        if(this.firstName == s.firstName && this.lastName == s.lastName)
            return true;
        if(this.firstName != null) {
            if(!this.firstName.equals(s.firstName))
                return false;
        } else if(this.firstName == null && s.firstName != null)
            return false;
        if (this.lastName != null) {
            if(!this.lastName.equals(s.lastName))
                return false;
        } else if(this.lastName == null && s.lastName != null)
            return false;
        //jeśli dojdziemy do tego miejsca to obiekty są równe
        return true;
    }
    
    public static void main(String[] args) {
		
    	Demo a = new Demo("Jan", "Kiler");
    	Demo b = new Demo("Beata", "Kiepska");
    	
    	System.out.println(a.equals(b));
    	
	}
}


	

