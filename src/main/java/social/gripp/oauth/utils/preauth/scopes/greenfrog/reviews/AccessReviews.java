package social.gripp.oauth.utils.preauth.scopes.greenfrog.reviews;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("#oauth2.hasScope('access_reviews')")
public @interface AccessReviews {
}
