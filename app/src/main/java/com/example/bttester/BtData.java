package com.example.bttester;


import java.util.ArrayList;

public class BtData {
    Float totalWeight = 0f;
    Float forwardWeight = 0f;
    Float trainA = 0f;
    Float trainB = 0f;
    String scaleName = "";
    String eventReport = "";
    ArrayList<SensorData> sensorArrayList = new ArrayList<SensorData>();

    public BtData() {
    }

    public BtData(String eventReport){
        this.eventReport = eventReport;
    }

    public BtData(String scaleName, Float totalWeight) {
        this.scaleName = scaleName;
        this.totalWeight = totalWeight;
    }

    public BtData(String scaleName,Float totalWeight, Float forwardWeight) {
        this.scaleName = scaleName;
        this.totalWeight = totalWeight;
        this.forwardWeight = forwardWeight;
    }

    public BtData(String scaleName,Float totalWeight, Float forwardWeight, Float trainA) {
        this.scaleName = scaleName;
        this.totalWeight = totalWeight;
        this.forwardWeight = forwardWeight;
        this.trainA = trainA;
    }

    public BtData(String scaleName,Float totalWeight, Float forwardWeight, Float trainA, Float trainB) {
        this.scaleName = scaleName;
        this.totalWeight = totalWeight;
        this.forwardWeight = forwardWeight;
        this.trainA = trainA;
        this.trainB = trainB;
    }

    public BtData(ArrayList<SensorData> sensorArrayList) {
        this.sensorArrayList = sensorArrayList;
    }

}

class SensorData {
    String sensorName;
    float sensorValue;

    public SensorData(String sensorName, float sensorValue) {
        this.sensorName = sensorName;
        this.sensorValue = sensorValue;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public float getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(float sensorValue) {
        this.sensorValue = sensorValue;
    }
}