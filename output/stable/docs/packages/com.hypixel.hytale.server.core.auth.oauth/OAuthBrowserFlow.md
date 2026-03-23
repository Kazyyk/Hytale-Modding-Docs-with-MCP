---
title: "OAuthBrowserFlow"
kind: "class"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthBrowserFlow"
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
public abstract class OAuthBrowserFlow extends OAuthFlow
```

Abstract base for browser-based OAuth authorization code flow with PKCE. Subclasses implement `onFlowInfo(String)` to present the authorization URL to the user.

## Abstract Methods

```java
public abstract void onFlowInfo(String var1)
```

Called with the authorization URL that the user should visit to complete authentication.
