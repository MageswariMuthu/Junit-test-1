package org.example

import spock.lang.Specification

class StringUtilsSpec extends Specification {

    def "test reverse method"() {
        expect:
        StringUtils.reverse("abc") == "cba"
        StringUtils.reverse("789") == "987"
        StringUtils.reverse("") == ""  // Edge case: Empty string
        StringUtils.reverse("a") == "a" // Edge case: Single character
    }
}

