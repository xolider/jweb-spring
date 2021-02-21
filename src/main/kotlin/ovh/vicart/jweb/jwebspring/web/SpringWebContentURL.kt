package ovh.vicart.jweb.jwebspring.web


import ovh.vicart.jweb.jweb.web.WebContentURL
import java.net.URL
import javax.servlet.http.HttpServletRequest

class SpringWebContentURL {

    companion object {
        fun getWebContentFrom(localContent: String, request: HttpServletRequest) : URL {
            return WebContentURL.getWebContentFrom(localContent, URL(request.requestURL.toString()))
        }
    }
}