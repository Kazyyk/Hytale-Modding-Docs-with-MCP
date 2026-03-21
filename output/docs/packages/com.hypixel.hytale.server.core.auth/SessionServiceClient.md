---
title: "SessionServiceClient"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.SessionServiceClient"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "session"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class SessionServiceClient
```

HTTP client for the Hytale Session Service (sessions.hytale.com). Handles authorization grants, token exchange, JWKS retrieval, game profile listing, game session creation/refresh/termination. Uses virtual threads for async HTTP operations.

## Constructor

```java
public SessionServiceClient(@Nonnull String sessionServiceUrl)
```

## Methods

```java
public CompletableFuture<String> requestAuthorizationGrantAsync(@Nonnull String identityToken, @Nonnull String serverAudience, @Nonnull String bearerToken)
```

Requests an authorization grant from the Session Service for server-join authentication.

```java
public CompletableFuture<String> exchangeAuthGrantForTokenAsync(@Nonnull String authorizationGrant, @Nonnull String x509Fingerprint, @Nonnull String bearerToken)
```

Exchanges an authorization grant and X.509 certificate fingerprint for an access token.

```java
@Nullable
public SessionServiceClient.JwksResponse getJwks()
```

Fetches the JSON Web Key Set from the Session Service `/.well-known/jwks.json` endpoint.

```java
@Nullable
public SessionServiceClient.GameProfile[] getGameProfiles(@Nonnull String oauthAccessToken)
```

Fetches available game profiles from the Account Data service.

```java
public SessionServiceClient.GameSessionResponse createGameSession(@Nonnull String oauthAccessToken, @Nonnull UUID profileUuid)
```

Creates a new game session for the given profile UUID.

```java
public CompletableFuture<SessionServiceClient.GameSessionResponse> refreshSessionAsync(@Nonnull String sessionToken)
```

Refreshes an existing game session using the current session token.

```java
public void terminateSession(@Nonnull String sessionToken)
```

Terminates a game session via DELETE request.

## Inner Types

- [AccessTokenResponse](SessionServiceClient.AccessTokenResponse.md)
- [AuthGrantResponse](SessionServiceClient.AuthGrantResponse.md)
- [GameProfile](SessionServiceClient.GameProfile.md)
- [GameSessionResponse](SessionServiceClient.GameSessionResponse.md)
- [JwkKey](SessionServiceClient.JwkKey.md)
- [JwksResponse](SessionServiceClient.JwksResponse.md)
- [LauncherDataResponse](SessionServiceClient.LauncherDataResponse.md)
