package com.spring.soap.api.sec;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME="Auth";
    public static final String SECRET="omar@korbi.net";
    public static final long EXPIRATION=10*24*3600;
    public static final String HEADER_PREFIX="Bearer ";
}
