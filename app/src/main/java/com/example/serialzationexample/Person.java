package com.example.serialzationexample;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Person implements Parcelable {

    private  String firstName;
    private String lastName;
    private  String qualification;


    public Person() {
       super();
    }

    public Person (Parcel parcel){
         this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.qualification = parcel.readString();
    }

//    Implement the methods Associated when using Parcelable

    @Override
    public int describeContents() {
        return 0;
    }

//    It is basically used to initialize values
    @Override
    public void writeToParcel(Parcel dest, int flags) {
         dest.writeString(this.firstName);
         dest.writeString(this.lastName);
         dest.writeString(this.qualification);
    }

//    Then we create an Instance of Creator
    public static final Creator<Person> CREATOR = new Creator<Person>() {
    @Override
    public Person createFromParcel(Parcel source) {
        return new Person(source);
    }

    @Override
    public Person[] newArray(int size) {
        return new Person[size];
    }
};



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
