---
title: "MemoryAuthCredentialStoreProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.MemoryAuthCredentialStoreProvider"
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
public class MemoryAuthCredentialStoreProvider implements AuthCredentialStoreProvider
```

Factory that creates in-memory (non-persistent) credential stores. Registered as the default provider with `Priority.DEFAULT`.

## Constants

```java
public static final String ID = "Memory"
```

## Methods

```java
@Nonnull
@Override
public IAuthCredentialStore createStore()
```

Creates a [DefaultAuthCredentialStore](DefaultAuthCredentialStore.md) (in-memory, non-persistent).
