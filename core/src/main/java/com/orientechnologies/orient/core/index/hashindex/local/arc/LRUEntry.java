/*
 * Copyright 2010-2012 Luca Garulli (l.garulli--at--orientechnologies.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orientechnologies.orient.core.index.hashindex.local.arc;

/**
 * @author Andrey Lomakin
 * @since 25.02.13
 */
class LRUEntry {
  long     fileId;
  long     pageIndex;

  long     dataPointer;

  long     hashCode;

  LRUEntry next;

  LRUEntry after;
  LRUEntry before;

  boolean  isDirty;
  boolean  managedExternally;
}
