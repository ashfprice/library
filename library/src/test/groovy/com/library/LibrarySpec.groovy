package com.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
 
when:"A Library has location and openingHours"
def library=new Library(location:'City Campus',
openingHours:'24hours')

then:"the to String method will merge them."
library.toString()=='City Campus,24hours'

    }
}
