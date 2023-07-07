/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

/**
 *
 * @author nazal
 */
public class main {
    
    public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student();
    
//    student 1
    String name_1 = "babu";
    int roll_no_1 = 10;
    int[] marks_1 = { 1, 2, 3, 4, 5 };
    
//  student 2
    String name_2 = "nazal";
    int roll_no_2 = 7;
    int[] marks_2 = { 5, 6, 7, 8, 9 };

//    inititalising
    s1.initialise(name_1, roll_no_1, marks_1);
    s2.initialise(name_2, roll_no_2, marks_2);
    
//    returns total
    s1.getTotal();
    s2.getTotal();
    
//    sets total 
    int s1_total = s1.setTotal();
    int s2_total = s2.setTotal();
    
//    print student 1 details
    s1.printDetail();
    System.out.println(s1_total);
    
//    student 2 detail
    s2.printDetail();
    System.out.println(s2_total);
    
    System.out.println("\nTotal of both students are "+s2.greatTotal);
}
    
}
