package com.evil.inc.algoe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DocumentGeneratorTest {

    @Test
    public void generateDocument() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";

        Assertions.assertThat(DocumentGenerator.generateDocument(characters, document)).isTrue();
    }
}
