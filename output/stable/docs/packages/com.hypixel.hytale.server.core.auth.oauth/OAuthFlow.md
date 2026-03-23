---
title: "OAuthFlow"
kind: "class"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthFlow"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "oauth"
---

**Package:** `com.hypixel.hytale.server.core.auth.oauth`

```java
abstract class OAuthFlow
```

Abstract base class for all OAuth flows. Manages the flow lifecycle via a `CompletableFuture<OAuthResult>`, storing the token response on success or an error message on failure.

## Methods

```java
public OAuthClient.TokenResponse getTokenResponse()
```

```java
public OAuthResult getResult()
```

```java
public String getErrorMessage()
```

```java
public CompletableFuture<OAuthResult> getFuture()
```

Returns the future that completes when the flow finishes.
