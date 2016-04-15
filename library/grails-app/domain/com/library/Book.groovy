package com.library

class Book {

String title

String author

String isbn

Date dateBorrowed

Date returnDate

Student student

String toString(){

"$title,$author,$isbn"

}

    static constraints = {

title()

author()

isbn maxSize: 15

student()

dateBorrowed()

returnDate()

    }
}
