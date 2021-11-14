package com.evil.inc.algoexpert;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentGeneratorTest {

    @Test
    public void generateDocument() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";

        Assertions.assertThat(DocumentGenerator.generateDocument(characters, document)).isTrue();
    }
}