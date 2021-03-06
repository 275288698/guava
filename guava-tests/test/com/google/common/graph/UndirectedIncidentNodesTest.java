/*
 * Copyright (C) 2015 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.testing.EqualsTester;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class UndirectedIncidentNodesTest {

  @Test
  public void testEquals() {
    new EqualsTester()
        .addEqualityGroup(
            UndirectedIncidentNodes.of("foo", "bar"),
            UndirectedIncidentNodes.of("bar", "foo"),
            UndirectedIncidentNodes.of(ImmutableSet.of("foo", "bar")))
        .addEqualityGroup(
            UndirectedIncidentNodes.of("test", "test"),
            UndirectedIncidentNodes.of(ImmutableSet.of("test")))
        .testEquals();
  }
}
