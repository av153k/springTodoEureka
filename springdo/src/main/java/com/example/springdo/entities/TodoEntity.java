package com.example.springdo.entities;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "todos")
@Entity()
@Data()
@Getter()
@Setter()
@NoArgsConstructor()
public class TodoEntity {
    
    @Id
    private String id;
    private String title;
    private String description;
    private String createdBy;
    private String createdOn;
    private String updateOn;
}
