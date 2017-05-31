/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pig;

import org.apache.pig.data.Tuple;

/**
 * The interface that handles errors thrown by the
 * {@link StoreFuncInterface#putNext(Tuple)}
 *
 */
public interface ErrorHandler {
    /**
     * Method invoked on success processing of tuple
     * 
     * @param uniqueSignature
     *            a unique signature to identify the operator
     */
    public void onSuccess(String uniqueSignature);

    /**
     * Method invoked when an error occurs processing of tuple
     * 
     * @param uniqueSignature
     *            a unique signature to identify the operator
     * @param e
     *            Exception encountered while processing input
     * @param inputTuple
     *            the tuple to store.
     */
    public void onError(String uniqueSignature, Exception e);
}
