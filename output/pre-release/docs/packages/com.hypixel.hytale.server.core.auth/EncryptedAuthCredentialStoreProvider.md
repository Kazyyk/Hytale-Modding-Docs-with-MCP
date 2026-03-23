---
title: "EncryptedAuthCredentialStoreProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.EncryptedAuthCredentialStoreProvider"
api_surface: false
extends: ~
implements: ["AuthCredentialStoreProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
  - "credentials"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class EncryptedAuthCredentialStoreProvider implements AuthCredentialStoreProvider
```

Factory that creates `EncryptedAuthCredentialStore` instances with a configurable file path. Validates that the path is within a trusted root directory.

## Constants

```java
public static final String ID = "Encrypted"
```

```java
public static final String DEFAULT_PATH = "auth.enc"
```

## Methods

```java
@Nonnull
@Override
public IAuthCredentialStore createStore()
```

Creates an [EncryptedAuthCredentialStore](EncryptedAuthCredentialStore.md) at the configured path. Throws `IllegalStateException` if the path is outside a trusted root directory.
