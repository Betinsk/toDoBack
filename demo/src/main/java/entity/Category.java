package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Category {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String category;
	    private String description;
	    
	    public Category() {
	    	
	    }
	    
		public Category(Long id, String category, String description) {
			super();
			this.id = id;
			this.category = category;
			this.description = description;
		}
	    
	    

	 
	}


