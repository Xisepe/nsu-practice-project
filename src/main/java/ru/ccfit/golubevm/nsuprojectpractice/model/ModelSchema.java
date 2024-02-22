package ru.ccfit.golubevm.nsuprojectpractice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document
public class ModelSchema extends AbstractDocumentMetaInfo{
    @Id
    private String id;
    @Indexed
    private String name;
    private int version;
    private String jsonSchema;
}
