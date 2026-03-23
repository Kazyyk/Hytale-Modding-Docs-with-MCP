---
title: "CommonAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.CommonAsset"
api_surface: false
extends: null
implements: ["NetworkSerializable<Asset>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public abstract class CommonAsset implements NetworkSerializable<Asset>
```

Base class for assets distributed to clients via the common asset system. Each asset has a name, a SHA-256 hash, and lazily loaded binary blob data. Subclasses provide the mechanism for retrieving the raw bytes (file, resource, etc.).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `HASH_LENGTH` | `64` |
| `public static final` | `Pattern` | `HASH_PATTERN` | `^[A-Fa-f0-9]{64}$` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `String` | `getName()` |
| `@Nonnull public` | `String` | `getHash()` |
| `public` | `CompletableFuture<byte[]>` | `getBlob()` |
| `protected abstract` | `CompletableFuture<byte[]>` | `getBlob0()` |
| `@Nonnull public` | `Asset` | `toPacket()` |
| `@Nonnull public static` | `String` | `hash(byte[] bytes)` |
