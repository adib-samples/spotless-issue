/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Application starts")
class ApplicationStartsTest {

  @Test
  @DisplayName("Application with all modules can start successfully")
  void applicationStarts() {
    assertThatCode(
            () -> {
              String randomPort = "--spring.application.json={\"server.port\":\"0\"}";
              System.out.println(randomPort);
              String[] args = {randomPort};
              Application.main(args);
            })
        .doesNotThrowAnyException();
  }
}
