/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("QualifiedName Tests")
public class QualifiedNameTests {

  @Test
  @DisplayName("Invalid qualified names throw IllegalArgumentException")
  public void invalidNames() {
    assertThatIllegalArgumentException().isThrownBy(() -> new QualifiedName(""));
    assertThatIllegalArgumentException().isThrownBy(() -> new QualifiedName("."));
    assertThatIllegalArgumentException().isThrownBy(() -> new QualifiedName("h"));
    assertThatIllegalArgumentException().isThrownBy(() -> new QualifiedName("foo"));
    assertThatIllegalArgumentException().isThrownBy(() -> new QualifiedName("foo.bar."));
  }

  @Test
  @DisplayName("Valid qualified names don't throw any exceptions")
  public void validName() {
    assertThatCode(() -> new QualifiedName("a.b")).doesNotThrowAnyException();
    assertThatCode(() -> new QualifiedName("foo.bar.Baz")).doesNotThrowAnyException();
  }

  @Test
  @DisplayName("Can read parts of a qualified name")
  public void readParts() {
    assertThat(new QualifiedName("a.b").getName()).isEqualTo("a.b");
    assertThat(new QualifiedName("a.b").getQualifier()).isEqualTo("a");
    assertThat(new QualifiedName("a.b").getUnqualifiedName()).isEqualTo("b");

    assertThat(new QualifiedName("a.b.c").getQualifier()).isEqualTo("a.b");
    assertThat(new QualifiedName("a.b.c").getUnqualifiedName()).isEqualTo("c");
  }

  @Test
  @DisplayName("Test equals & hashCode")
  public void hashCodeEquals() {
    EqualsVerifier.forClass(QualifiedName.class).verify();
  }

  @Test
  @DisplayName("toString works")
  public void toStringWorks() {
    assertThat(new QualifiedName("a.b").toString()).isEqualTo("a.b");
  }
}
