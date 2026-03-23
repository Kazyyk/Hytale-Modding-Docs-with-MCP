---
title: "HttpResponseException"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.HttpResponseException"
api_surface: false
extends: "java.io.IOException"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "auth"
  - "exception"
  - "http"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class HttpResponseException extends IOException
```

Thrown when an HTTP request during authentication returns a non-success status code. Captures both the status code and the response body (truncated to 200 characters in the exception message).

## Constructors

```java
public HttpResponseException(int statusCode, String responseBody)
```

Creates an exception with the given HTTP status code and response body.

## Methods

```java
public int getStatusCode()
```

Returns the HTTP status code.

```java
public String getResponseBody()
```

Returns the full response body string.

## Related Types

- `ServerAuthManager` -- may throw this during authentication flows
- `JWTValidator` -- may throw this during token validation
