---
title: "OAuthClient"
kind: "class"
package: "com.hypixel.hytale.server.core.auth.oauth"
fqcn: "com.hypixel.hytale.server.core.auth.oauth.OAuthClient"
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
public class OAuthClient
```

OAuth 2.0 client implementation supporting both browser-based (authorization code with PKCE) and device code flows. Manages local HTTP callback server for browser flow, PKCE challenge generation, token exchange, and token refresh against the Hytale OAuth endpoints.

## Methods

```java
public Runnable startFlow(@Nonnull OAuthBrowserFlow flow)
```

Starts a browser-based OAuth authorization code flow with PKCE. Launches a local HTTP callback server, generates a CSRF state and PKCE code verifier, and calls `flow.onFlowInfo()` with the authorization URL. Returns a `Runnable` that cancels the flow when invoked.

```java
public Runnable startFlow(OAuthDeviceFlow flow)
```

Starts a device code flow. Requests device authorization, calls `flow.onFlowInfo()` with the user code and verification URI, then polls for token completion. Returns a `Runnable` that cancels the flow.

```java
@Nullable
public OAuthClient.TokenResponse refreshTokens(@Nonnull String refreshToken)
```

Refreshes OAuth tokens using the given refresh token. Returns `null` on failure.

## Inner Types

- [TokenResponse](OAuthClient.TokenResponse.md) -- OAuth token endpoint response
- [DeviceAuthResponse](OAuthClient.DeviceAuthResponse.md) -- device authorization endpoint response
