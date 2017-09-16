/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanish
 */
public class Deepak {
    public void remove(Student[] students,int index,int len){
        if(index<0 || index >= students.length)
                    throw new IllegalArgumentException();
                Student[] temp;
                temp = students;
                students = new Student[len-1];
                len--;
                
                for(int i = 0; i < len; i++){
                    if(i == index)
                        continue;
                    students[i] = temp[i];
                }
        
    }
  
        
    
}
