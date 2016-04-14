package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

when:"A Book has title,author and isbn"
def book=new Book(title:'Bars for dummies',
author:'Chris Hope',
isbn:'BFD101')

then:"the to String method will merge them."
book.toString()=='Bars for dummies,Chris Hope,BFD101'
    }
}
