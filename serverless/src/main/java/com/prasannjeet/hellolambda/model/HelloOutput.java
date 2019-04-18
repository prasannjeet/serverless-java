/*
 * Copyright (c) 2019. Prasannjeet Singh. Master's Student, Linnaeus University
 */

package com.prasannjeet.hellolambda.model;

import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import lombok.Data;

@Data
public class HelloOutput {
    private String message;
    private String functionName;
    private int theHashCode;
    private int memoryLimit;
//    CognitoIdentity cognitoIdentity;
}
