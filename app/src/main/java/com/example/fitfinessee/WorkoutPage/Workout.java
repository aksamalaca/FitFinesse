package com.example.fitfinessee.WorkoutPage;

public class Workout {
    private String workoutName;
    private int workoutImage;
    private String workoutNumber;
    private String workoutHeader;

    public Workout(String workoutName, int workoutImage, String workoutNumber) {
        this.workoutName = workoutName;
        this.workoutImage = workoutImage;
        this.workoutNumber =  workoutNumber;
        this.workoutHeader = workoutHeader;
    }

    // getter and setter methods
    public String getWorkoutName() {

        return workoutName;
    }

    public void setWorkoutName(String workoutName) {

        this.workoutName = workoutName;
    }

    public int getWorkoutImage() {

        return workoutImage;
    }

    public void setWorkoutImage(int workoutImage) {

        this.workoutImage = workoutImage;
    }
    public String getWorkoutNumber() {

        return workoutNumber;
    }

    public void setWorkoutNumber(String workoutNumber) {

        this.workoutNumber = workoutNumber;
    }

    public String getWorkoutHeader() {
        return workoutHeader;
    }

    public void setWorkoutHeader(String workoutHeader) {
        this.workoutHeader = workoutHeader;
    }
}
