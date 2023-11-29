package pt_ict6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n ╭──────── ⋅ ⋅ ──── ✩ ──── ⋅ ⋅ ────╮");
        System.out.printf("   Enter your Name: ");
        String name = in.nextLine();
        
        System.out.printf("   Enter your Strand: ");
        String strand = in.nextLine();

        System.out.printf("   Enter your Student ID: ");
        int id = in.nextInt();

        System.out.printf("   Enter your Grade Level: ");
        int year_lvl = in.nextInt();        
        System.out.println("\n ╰──────── ⋅ ⋅ ──── ✩ ──── ⋅ ⋅ ────╯");
        
       
        
        Grade g1 = new Grade(name, strand, id, year_lvl);
        
        g1.display();
        
        System.out.println("\n ‿︵‿︵୨˚̣̣̣͙୧ ENTER STUDENT GRADES ୨˚̣̣̣͙୧‿︵‿︵");
        
        
        System.out.printf("   Enter your Midterm Grade: ");
        double m_grade = in.nextDouble();
        System.out.printf("   Enter your Final Grade: ");
        double f_grade = in.nextDouble();
        
        Grade g1final = new Grade(name, strand, id, year_lvl, m_grade, f_grade);
        
        g1final.computed();
        
        
    }
}