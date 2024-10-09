package com.example.cicd4;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @NotBlank(message="You must enter a name")
    private String name;

    @Min(value=1, message="Must be greater or equal to 1")
    private int id;

    @NotBlank(message="You must enter an age")
    private String age;

    @NotBlank(message="You must enter an age")
    private String title;

    @NotBlank(message="You must enter a position")
    private String position;

    @Email(message = "Not valid email")
    private String email;
}
