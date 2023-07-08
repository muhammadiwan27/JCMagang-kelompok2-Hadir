package com.juaracoding.utils;

import javax.lang.model.util.TypeKindVisitor14;

public enum TestScenarios {
    T1("Login Valid Functionality Test"),
    T2("Login Invalid Functionality Test"),
    T3("Dashboard Valid Functionality Test"),
    T4("Management User Valid Functionality Test"),
    T5("Management User Invalid Functionality Test"),
    T6("Management Pendaftaran User Valid Functionality Test"),
    T7("Management Pendaftaran User Invalid Functionality Test"),
    T8("Management Divisi Valid Functionality Test"),
    T9("Management Divisi Invalid Functionality Test"),
    T10("Management Unit Testing Valid Functionality Test"),
    T11("Management Posisi Valid Functionality Test"),
    T12("Management Client Upliner Valid Functionality Test"),
    T13("Management Absen Point Valid Functionality Test"),
    T14("Management Jabatan Valid Functionality Test"),
    T15("Management Shifting Valid Functionality Test"),
    T16("Management Jadwal Valid Functionality Test"),
    T17("Management Event Date Valid Functionality Test"),
    T18("Management Hari Libur Valid Functionality Test"),
    T19("Management Day Off Valid Functionality Test");

    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
