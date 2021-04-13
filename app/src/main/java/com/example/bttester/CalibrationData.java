package com.example.bttester;

public class CalibrationData {
    float weight1;
    float weight2;
    float weight3;
    int calibrationType;

    public static final int EMPTY_CALIBRATION = 0;
    public static final int FULL_CALIBRATION = 1;

    public CalibrationData(float weight1, float weight2, float weight3, int calibrationType) {
        this.weight1 = weight1;
        this.weight2 = weight2;
        this.weight3 = weight3;
        this.calibrationType = calibrationType;
    }
}