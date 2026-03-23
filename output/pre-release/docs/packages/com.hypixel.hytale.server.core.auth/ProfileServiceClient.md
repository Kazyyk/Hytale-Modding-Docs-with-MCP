---
title: "ProfileServiceClient"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.ProfileServiceClient"
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
public class ProfileServiceClient
```

HTTP client for the Hytale Profile Service (account-data.hytale.com). Provides synchronous and asynchronous methods to look up game profiles by UUID or username using Bearer token authentication.

## Constructor

```java
public ProfileServiceClient(@Nonnull String profileServiceUrl)
```

## Methods

```java
@Nullable
public ProfileServiceClient.PublicGameProfile getProfileByUuid(@Nonnull UUID uuid, @Nonnull String bearerToken)
```

Fetches a game profile by UUID using Bearer authentication. Returns `null` on any failure.

```java
public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUuidAsync(@Nonnull UUID uuid, @Nonnull String bearerToken)
```

```java
@Nullable
public ProfileServiceClient.PublicGameProfile getProfileByUsername(@Nonnull String username, @Nonnull String bearerToken)
```

Fetches a game profile by username using Bearer authentication. Returns `null` on any failure.

```java
public CompletableFuture<ProfileServiceClient.PublicGameProfile> getProfileByUsernameAsync(@Nonnull String username, @Nonnull String bearerToken)
```

## Inner Types

- [PublicGameProfile](ProfileServiceClient.PublicGameProfile.md) -- profile data returned by the service
