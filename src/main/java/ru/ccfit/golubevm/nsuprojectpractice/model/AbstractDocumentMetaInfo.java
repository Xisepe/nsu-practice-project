package ru.ccfit.golubevm.nsuprojectpractice.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public abstract class AbstractDocumentMetaInfo implements DocumentMetaInfo {
    protected UUID authorId;
    protected LocalDateTime timeOfCreation;
}
