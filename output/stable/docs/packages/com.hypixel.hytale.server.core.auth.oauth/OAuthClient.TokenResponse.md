---
title: "TokenResponse"
kind: "record"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthClient.TokenResponse"
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
public record TokenResponse(@Nullable String accessToken, @Nullable String refreshToken, @Nullable String idToken, @Nullable String error, int expiresIn)
```

Part of the Hytale server authentication system.
