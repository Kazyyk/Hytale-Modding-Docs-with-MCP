---
title: "DeviceAuthResponse"
kind: "record"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthClient.DeviceAuthResponse"
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
public record DeviceAuthResponse(String deviceCode, String userCode, String verificationUri, String verificationUriComplete, int expiresIn, int interval)
```

Part of the Hytale server authentication system.
