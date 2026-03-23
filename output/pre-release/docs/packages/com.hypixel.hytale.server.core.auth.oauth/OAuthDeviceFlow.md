---
title: "OAuthDeviceFlow"
kind: "class"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthDeviceFlow"
api_surface: false
extends: "OAuthFlow"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "oauth"
---

**Package:** `com.hypixel.hytale.server.core.auth.oauth`

```java
public abstract class OAuthDeviceFlow extends OAuthFlow
```

Abstract base for OAuth device code flow. Subclasses implement `onFlowInfo(String, String, String, int)` to present the user code and verification URI.

## Abstract Methods

```java
public abstract void onFlowInfo(String var1, String var2, String var3, int var4)
```

Called with the user code, verification URI, complete verification URI, and expiration in seconds.
