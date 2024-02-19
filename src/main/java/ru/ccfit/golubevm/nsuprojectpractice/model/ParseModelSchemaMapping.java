package ru.ccfit.golubevm.nsuprojectpractice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Document
public class ParseModelSchemaMapping extends AbstractDocumentMetaInfo {
    @Id
    private String id;
    private String schemaId;
    private List<PropertyMapping> propertyMappings;
}
