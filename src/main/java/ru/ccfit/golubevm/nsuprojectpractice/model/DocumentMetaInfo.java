package ru.ccfit.golubevm.nsuprojectpractice.model;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DocumentMetaInfo {
    UUID getAuthorId();
    void setAuthorId(UUID authorId);
    LocalDateTime getTimeOfCreation();
    void setTimeOfCreation(LocalDateTime timeOfCreation);
}
