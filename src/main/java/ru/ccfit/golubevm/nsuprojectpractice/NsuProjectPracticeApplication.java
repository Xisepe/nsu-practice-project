package ru.ccfit.golubevm.nsuprojectpractice;

import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.schema.MongoJsonSchema;
import ru.ccfit.golubevm.nsuprojectpractice.model.ParseModelSchemaMapping;

@SpringBootApplication
public class NsuProjectPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsuProjectPracticeApplication.class, args);
    }

}
