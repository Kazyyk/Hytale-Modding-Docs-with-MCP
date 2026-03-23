---
title: "AssetPath"
kind: "record"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.AssetPath"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public record AssetPath(@Nonnull String packId, @Nonnull Path path)
```

Immutable pair of an asset pack identifier and a file path within that pack. Used throughout the asset editor system to uniquely identify an asset.

## Fields

| Field | Type | Description |
|---|---|---|
| `packId` | `String` | Asset pack identifier |
| `path` | `Path` | Relative file path within the pack |

## Constants

| Constant | Description |
|---|---|
| `EMPTY_PATH` | Sentinel value with empty pack ID and empty path |

## Constructors

```java
public AssetPath(@Nonnull String packId, @Nonnull Path path)
```

```java
public AssetPath(com.hypixel.hytale.protocol.packets.asseteditor.AssetPath assetPath)
```

Converts from the protocol packet representation.

## Methods

| Method | Description |
|---|---|
| `AssetPath toPacket()` | Converts to the protocol packet representation with Unix-style path separators |
