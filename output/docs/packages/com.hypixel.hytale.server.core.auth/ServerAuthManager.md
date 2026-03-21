---
title: "ServerAuthManager"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.ServerAuthManager"
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
public class ServerAuthManager
```

Singleton manager for server-side authentication state. Handles OAuth flows (browser and device), game session creation/refresh via the Session Service, credential store management, token expiry scheduling, and multi-profile selection. Central coordination point for all server authentication operations.

## Singleton Access

```java
public static ServerAuthManager getInstance()
```

Returns the singleton instance, creating it on first access (double-checked locking).

## Lifecycle

```java
public void initialize()
```

Initializes the auth manager from command-line options and environment variables. Loads session/identity tokens if provided, validates them, and sets the auth mode.

```java
public void initializeCredentialStore()
```

Initializes the credential store from server configuration and attempts to restore a previous session from stored credentials.

```java
public void shutdown()
```

Cancels active flows, stops the refresh scheduler, and terminates the game session in singleplayer mode.

```java
public void logout()
```

Clears all authentication state, credentials, and pending profiles.

## Token Access

```java
@Nullable
public String getIdentityToken()
```

```java
@Nullable
public String getSessionToken()
```

```java
public boolean hasIdentityToken()
```

```java
public boolean hasSessionToken()
```

```java
@Nullable
public String getOAuthAccessToken()
```

Returns the OAuth access token, refreshing it first if needed. Returns `null` if refresh fails.

## OAuth Flows

```java
public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(@Nonnull OAuthBrowserFlow flow)
```

Starts a browser-based OAuth flow. Returns `FAILED` in singleplayer mode.

```java
public CompletableFuture<ServerAuthManager.AuthResult> startFlowAsync(OAuthDeviceFlow flow)
```

Starts a device code OAuth flow. Returns `FAILED` in singleplayer mode.

## Profile Management

```java
@Nullable
public SessionServiceClient.GameProfile[] getPendingProfiles()
```

```java
public boolean selectPendingProfile(int index)
```

Selects a profile by 1-based index from the pending profiles list.

```java
public boolean selectPendingProfileByUsername(String username)
```

## Status

```java
public ServerAuthManager.AuthMode getAuthMode()
```

```java
public boolean isSingleplayer()
```

```java
public boolean isOwner(@Nullable UUID playerUuid)
```

```java
public String getAuthStatus()
```

Returns a human-readable status string including auth mode, token presence, and expiry countdown.

## Inner Types

- [AuthMode](ServerAuthManager.AuthMode.md) -- authentication mode enum
- [AuthResult](ServerAuthManager.AuthResult.md) -- authentication result enum
