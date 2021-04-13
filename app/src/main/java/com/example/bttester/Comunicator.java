package com.example.bttester;

public class Comunicator {

    int comunicationType;

    CalibrationData calibrationData;

    public static final int REQUEST_INIT = 0;
    public static final int REQUEST_TOTAL_WEIGHT = 1;
    public static final int REQUEST_WEIGHT_1TRAIN = 2;
    public static final int REQUEST_WEIGHT_2TRAIN = 3;
    public static final int REQUEST_SENSOR_DATA = 4;
    public static final int REQUEST_STATISTIC_REPORT = 5;
    public static final int REQUEST_CONFIGURATION_FILE = 6;
    public static final int SENDING_CALIBRATION_DATA = 7;


    public Comunicator(int comunicationType) {
        this.comunicationType = comunicationType;
    }

    public Comunicator(int comunicationType, CalibrationData calibrationData) {
        this.comunicationType = comunicationType;
        this.calibrationData = calibrationData;
    }

    public int getComunicationType() {
        return comunicationType;
    }

    public CalibrationData getCalibrationData() {
        return calibrationData;
    }

    public void setComunicationType(int comunicationType) {
        this.comunicationType = comunicationType;
    }
}