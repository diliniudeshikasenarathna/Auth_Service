package com.example.auth_service.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.function.Function;

public class JwtUtil {
    private final String SECRET_KEY="jkskdjokadklmknu^%%&^78733";

    public String generateToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() +1000*60*60))
                .signWith(SignatureAlgorithm.HS256,SECRET_KEY)
                .compact();
    }
    public String extractUsername(String token){
        return extractClaim(token, Claims::getSubject);
    }
    public boolean validateToken(String token, UserDetails userDetails){
        return extractUsername(token).equals(userDetails.getUsername()) && !isExpired(token);

    }
    private boolean isExpired(String token){
        return extractExpiration(token).before(new Date());

    }
    private Date extractExpiration(String token){
        return extractClaim(token, Claims::getExpiration);

    }

    private <T> T extractClaim(String token, Function<Claims ,T> resolver) {
        return resolver.apply(
                Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody()

        );
    }
}
