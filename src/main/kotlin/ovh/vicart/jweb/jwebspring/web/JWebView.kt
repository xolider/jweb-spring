package ovh.vicart.jweb.jwebspring.web

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.util.MultiValueMap
import org.springframework.util.MultiValueMapAdapter
import ovh.vicart.jweb.jweb.WebPage

class JWebView : ResponseEntity<String> {

    constructor(webPage: WebPage, headers: MultiValueMap<String, String>, httpStatus: HttpStatus)
        : super(webPage.render(), headers, httpStatus)
    constructor(webPage: WebPage) : super(webPage.render(), HttpStatus.OK)
    constructor(webPage: WebPage, httpStatus: HttpStatus) : super(webPage.render(), httpStatus)

}