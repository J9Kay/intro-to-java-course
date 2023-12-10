package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileManager {

    // Reads lines from a file and returns them as a List
    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }

    // Copies contents from inputFile to outputFile
    public void copy(String inputFile, String outputFile) throws IOException {
        Files.copy(Paths.get(inputFile), Paths.get(outputFile), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }

    public void reverseLines(String inputFile, String outputFile) throws IOException {
    List<String> lines = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    }

    Collections.reverse(lines);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
        String lineSeparator = System.lineSeparator();
        for (int i = 0; i < lines.size(); i++) {
            writer.write(lines.get(i));
            // Add a line separator except for the last line
            if (i < lines.size() - 1) {
                writer.write(lineSeparator);
            }
        }
    }
}
}
