package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Clothes {
    private int id;
    private String name;
    private String description;
    private Size size;
    private Category category;
    private String color;
    private long price;
    private Status status;
}
