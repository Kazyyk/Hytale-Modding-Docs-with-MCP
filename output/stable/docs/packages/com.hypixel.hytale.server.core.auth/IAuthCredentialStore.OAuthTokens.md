---
title: "OAuthTokens"
kind: "record"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.IAuthCredentialStore.OAuthTokens"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "oauth"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public record OAuthTokens(@Nullable String accessToken, @Nullable String refreshToken, @Nullable Instant accessTokenExpiresAt)
```

Part of the Hytale server authentication system.
