package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    // Method to check file extension
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename is null or empty");
        }
        return filename.endsWith(".java");
    }

    // Method to map filenames to values based on their extension
    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String filename : filenames) {
            try {
                int value = check(filename) ? 1 : 0;
                resultMap.put(filename, value);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }
        return resultMap;
    }
}

