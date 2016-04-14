package com.library

class Course {

String title

String code

String tutor

String department

String description

String toString(){

"$title,$code,$department"

}

    static constraints = {

title()

code()

department()

tutor()

description maxSize: 5000
    }
}
