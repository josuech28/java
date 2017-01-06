package com.service;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by joschinc on 1/5/17.
 */
public class RunServiceCheckImplTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ServiceCheckImplTest.class);
        for(Failure fail: result.getFailures()){
            System.out.println("Fail in " + fail);
        }
        System.out.println("Status " + result.wasSuccessful());
    }
}
