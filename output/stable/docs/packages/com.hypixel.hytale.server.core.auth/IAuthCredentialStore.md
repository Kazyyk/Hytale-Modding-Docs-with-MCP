---
title: "IAuthCredentialStore"
kind: "interface"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.IAuthCredentialStore"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "credentials"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public interface IAuthCredentialStore
```

Interface for storing and retrieving OAuth credentials and the selected game profile UUID. Implementations include in-memory and encrypted-on-disk variants.

## Methods

```java
void setTokens(@Nonnull IAuthCredentialStore.OAuthTokens var1)
```

```java
@Nonnull
IAuthCredentialStore.OAuthTokens getTokens()
```

```java
void setProfile(@Nullable UUID var1)
```

```java
@Nullable
UUID getProfile()
```

```java
void clear()
```

Clears all stored credentials and profile data.

## Inner Types

- [OAuthTokens](IAuthCredentialStore.OAuthTokens.md) -- record holding token data
