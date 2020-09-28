package com.akita.cactus.auth.component;

import com.akita.cactus.common.core.api.R;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import org.springframework.stereotype.Component;

@Component
public class RestWebResponseExceptionTranslator implements WebResponseExceptionTranslator {
    @Override
    public ResponseEntity<R> translate(Exception e) throws Exception {
        HttpStatus status = HttpStatus.resolve(((OAuth2Exception) e).getHttpErrorCode());
        return new ResponseEntity<>(new R<>(status, e.getMessage()), status);
    }
}
