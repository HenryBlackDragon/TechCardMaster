package com.chaban.techcardmaster.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cards")
public class Card {

    @Id
    private String id;

    private String title;
    private String difficulty;
    private String question;
    private String answer;
    private String subCategoryId;
}
