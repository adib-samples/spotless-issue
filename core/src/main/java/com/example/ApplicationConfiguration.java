/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

/**
 * This marker class is used to configure the location where spring boot will do component scanning
 * from.
 */
@EnableCaching
@EnableConfigurationProperties
@SpringBootApplication
public class ApplicationConfiguration {}
