/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.jwt;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.security.Key;
import java.security.Principal;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;
import py.edu.columbia.tcc.controller.view.utils.SimpleKeyGenerator;

/**
 *
 * @author tokio
 */
@Provider
@JWTToken
@Priority(Priorities.AUTHENTICATION)
public class JWTTokenFilter implements ContainerRequestFilter {
    @Override
    public ContainerRequest filter(ContainerRequest requestContext) {
        System.err.println("Ingresando a jwt filter");
//    public void filter(ContainerRequestContext requestContext) throws IOException {

        // Get the HTTP Authorization header from the request
        String authorizationHeader = requestContext.getHeaderValue(HttpHeaders.AUTHORIZATION);

        // Extract the token from the HTTP Authorization header
        String token = authorizationHeader.substring("Bearer".length()).trim();

        try {

            // Validate the token
//            Key key = keyGenerator.generateKey();
            Key key = new SimpleKeyGenerator().generateKey();
            Jwts.parser().setSigningKey(key).parseClaimsJws(token);
            System.out.println("#### valid token : " + token);
            JWTPrincipal principal  = buildPrincipal(token);
            JWTSecurityContext ctx = new JWTSecurityContext(
                                                    principal,
                                                    requestContext.isSecure());
                    requestContext.setSecurityContext(ctx);

        } catch (Exception e) {
            System.err.println("#### invalid token : " + token);
            throw new WebApplicationException(Status.UNAUTHORIZED);
        }
        
        throw new WebApplicationException(Status.UNAUTHORIZED);
//        return requestContext;
    }
    
    public String getUser(String token) {
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(new SimpleKeyGenerator().generateKey())
                    .parseClaimsJws(token)
                    .getBody();
            
            return body.getSubject();

        } catch (Exception e) {
            return null;
        }
    }
    
    private JWTPrincipal buildPrincipal(String token) {
        JWTPrincipal principal = null;
        try {
                principal = new JWTPrincipal(getUser(token));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return principal;
    }
    
    public class JWTPrincipal implements Principal {
        private String name;
        
        public JWTPrincipal(String name) {
            this.name           = name;
        }

        @Override
        public String getName() {
            return name;
        }
        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("JWTPrincipal {")
                   .append("name:").append(name).append(",")
                   .append("}");
            return builder.toString();
        }
    }

    public static class JWTSecurityContext implements SecurityContext {
        private Principal principal;
        private boolean      isSecure;
        private Set<String>  roles = new HashSet<>();

        public JWTSecurityContext(final Principal principal, final boolean isSecure) {
            this.principal  = principal;
            this.isSecure   = isSecure;
        }

        @Override
        public String getAuthenticationScheme() {
            return "JWT"; // informational
        }

        @Override
        public Principal getUserPrincipal() {
            return principal;
        }

        @Override
        public boolean isSecure() {
            return isSecure;
        }

        @Override
        public boolean isUserInRole(final String role) {
            return roles.contains(role);
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("JWTSecurityContext {")
                   .append("principal:").append(principal).append(",")
                   .append("roles:").append(roles).append(",")
                   .append("isSecure:").append(isSecure)
                   .append("}");
            return builder.toString();
        }
    }
}
