package ru.ccfit.golubevm.nsuprojectpractice.model;

import lombok.Data;

@Data
public class PropertyMapping {
    private String columnName;
    private int columnNumber;
    private String ref;
}
