/*
 * Copyright 2020 DEMO Inc.
 *
 * All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential
 */

package com.example.core;

/**
 * A object that has a unique identity.
 *
 * @param <T> The type of object's identity
 */
public interface Identifiable<T> {

  /** Returns the value of the primary key. */
  T getId();
}
