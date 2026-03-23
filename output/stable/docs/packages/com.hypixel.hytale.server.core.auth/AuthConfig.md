---
title: "AuthConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.AuthConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class AuthConfig
```

Central configuration constants for the Hytale authentication system. Contains OAuth URLs, HTTP client settings, environment variable names, and scope definitions. All fields are static constants; this class cannot be instantiated.

## Constants

| Constant | Type | Value |
|---|---|---|
| `USER_AGENT` | `String` | `"HytaleServer/" + ManifestUtil.getImplementationVersion()` |
| `OAUTH_AUTH_URL` | `String` | `"https://oauth.accounts.hytale.com/oauth2/auth"` |
| `OAUTH_TOKEN_URL` | `String` | `"https://oauth.accounts.hytale.com/oauth2/token"` |
| `DEVICE_AUTH_URL` | `String` | `"https://oauth.accounts.hytale.com/oauth2/device/auth"` |
| `CONSENT_REDIRECT_URL` | `String` | `"https://accounts.hytale.com/consent/client"` |
| `SESSION_SERVICE_URL` | `String` | `"https://sessions.hytale.com"` |
| `ACCOUNT_DATA_URL` | `String` | `"https://account-data.hytale.com"` |
| `BUILD_ENVIRONMENT` | `String` | `"release"` |
| `CLIENT_ID` | `String` | `"hytale-server"` |
| `SCOPES` | `String[]` | `{"openid", "offline", "auth:server"}` |
| `SCOPE_CLIENT` | `String` | `"hytale:client"` |
| `SCOPE_SERVER` | `String` | `"hytale:server"` |
| `SCOPE_EDITOR` | `String` | `"hytale:editor"` |
| `HTTP_TIMEOUT` | `Duration` | `Duration.ofSeconds(30L)` |
| `DEVICE_POLL_INTERVAL_SECONDS` | `int` | `15` |
| `ENV_SERVER_AUDIENCE` | `String` | `"HYTALE_SERVER_AUDIENCE"` |
| `ENV_SERVER_IDENTITY_TOKEN` | `String` | `"HYTALE_SERVER_IDENTITY_TOKEN"` |
| `ENV_SERVER_SESSION_TOKEN` | `String` | `"HYTALE_SERVER_SESSION_TOKEN"` |

## Methods

```java
@Nonnull
public static String getServerAudience()
```

Returns the server audience string. Uses the `HYTALE_SERVER_AUDIENCE` environment variable if set, otherwise falls back to the server session ID from `ServerAuthManager`.
