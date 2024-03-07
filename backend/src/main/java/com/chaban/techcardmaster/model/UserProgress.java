package com.chaban.techcardmaster.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "progress")
public class UserProgress {

    @Id
    private String id;

    private String userId;
    private String subCategoryId;
    private String totalProgress;
}
