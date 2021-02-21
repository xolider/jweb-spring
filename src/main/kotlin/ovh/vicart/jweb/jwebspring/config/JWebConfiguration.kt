package ovh.vicart.jweb.jwebspring.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Configuration
import ovh.vicart.jweb.jweb.JWeb


@Configuration
abstract class JWebConfiguration {

    @Value("\${server.servlet.context-path}")
    private var context: String? = null

    init {
        JWeb.configure().withContextPath(if(context != null) context!! else "/")
    }
}