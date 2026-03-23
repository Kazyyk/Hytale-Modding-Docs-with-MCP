---
title: "AuthCredentialStoreProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.AuthCredentialStoreProvider"
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
public interface AuthCredentialStoreProvider
```

Factory interface for creating credential store instances. Implementations are registered on the `CODEC` for JSON-based configuration. Each provider type produces a specific `IAuthCredentialStore` implementation.

## Fields

```java
BuilderCodecMapCodec<AuthCredentialStoreProvider> CODEC
```

Polymorphic codec for deserializing provider implementations from configuration. Keyed by `"Type"` with case-insensitive matching.

## Methods

```java
@Nonnull
IAuthCredentialStore createStore()
```

Creates and returns a new credential store instance.
