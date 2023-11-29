package pt_ict6;

public class Grade {
	String name;
	String strand;
	int id;
    int year_lvl;
    double m_grade;
    double f_grade;


    Grade(String name,  String strand, int id, int year_lvl) {
    	this.name = name;
    	this.strand = strand;
    	this.id = id;
        this.year_lvl = year_lvl;

        
    }
    
    Grade(String name,  String strand, int id, int year_lvl, double m_grade, double f_grade ) {
    	this.name = name;
    	this.strand = strand;
    	this.id = id;
        this.year_lvl = year_lvl;
        this.m_grade = m_grade;
        this.f_grade = f_grade;
        
    }
    
    
 
    
    

    void display() {
        System.out.println("\n┌──═DISPLAY STUDENT INFORMATION═──┐");
        System.out.println("\t Student ID: " + id);
        System.out.println("\t Student Name: " + name);
        System.out.println("\t Year Level: " + year_lvl);
        System.out.println("\t Strand: " + strand);
        System.out.println("\n└─────────────────────────────────┘");
    }
    
    void computed() {
    	//Computation
         double overall = (m_grade + f_grade )/2;
        
        
        System.out.println("\n╭─〔❨✧ DISPLAY STUDENT RESULT ✧❩〕─╮");
        System.out.println("   Student ID: " + id);
        System.out.println("   Student Name: " + name);
        System.out.println("   Midterm Grade: " + m_grade);
        System.out.println("   Final Grade: " + f_grade);
        System.out.println("   Overall Grade: " + overall);
        if(overall >= 75) {
        	System.out.println("   Result:\tYou are PASSED" );
        }
        else {
        	System.out.println("   result:\tYou are FAILED" );
       }              
        System.out.println("\n╰─〔❨✧ ✧ ✧ ✧ ✧ ✧✧ ✧ ✧ ✧✧ ✧ ✧ ✧ ✧❩〕─╯");
    }
    
 
}	
