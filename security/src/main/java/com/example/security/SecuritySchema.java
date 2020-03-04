/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example.security;

import javax.sql.DataSource;
import org.springframework.stereotype.Component;

@Component
public class SecuritySchema {

  public static final String SECURITY_SCHEMA = "security";

  SecuritySchema(DataSource dataSource) {
    System.out.println("hello");
  }
}
