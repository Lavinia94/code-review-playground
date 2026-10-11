package com.example.demo;

import java.util.*;

public class OrderProcessor {

    public double calc(List<Double> l) {
        double t = 0;
        for (int i = 0; i < l.size(); i++) {
            t = t + l.get(i);
        }
        if (t > 1000) {
            t = t * 0.9;
        }
        return t;
    }

    public String loadConfig(String path) {
        try {
            return new String(java.nio.file.Files.readAllBytes(java.nio.file.Path.of(path)));
        } catch (Exception e) {
        }
        return null;
    }
}
