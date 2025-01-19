/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springAPI.springstudy.model;

import java.time.LocalDate;
import lombok.*;

@Data
@Builder

public class Student {
    
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @NonNull
    private String Email;
    private int age;
    
}
