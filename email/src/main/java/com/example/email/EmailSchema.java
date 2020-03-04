/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example.email;

import javax.sql.DataSource;
import org.springframework.stereotype.Component;

@Component
public class EmailSchema {
  public EmailSchema(DataSource dataSource) {
    System.out.println("hello");
  }
}
