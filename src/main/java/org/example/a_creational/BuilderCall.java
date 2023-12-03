package org.example.a_creational;

import org.example.a_creational.builder.BuilderPattern;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BuilderCall  {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        BuilderPattern cook = new BuilderPattern()
                .builder()
                .chkNoodle(true)
                .vegetable(false)
                .oil(false)
                .chkSource(true)
                .build();

        bf.write(cook.getData());
        bf.close();
    }

}
