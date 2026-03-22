---
title: "SelectionPrefabSerializer"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.config"
fqcn: "com.hypixel.hytale.server.core.prefab.config.SelectionPrefabSerializer"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "prefab"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.prefab.config`

```java
public class SelectionPrefabSerializer
```

Provides SelectionPrefabSerializer functionality within the config subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `VERSION` | `8` |
| `private static final` | `BsonInt32` | `DEFAULT_SUPPORT_VALUE` | `new BsonInt32(0)` |
| `private static final` | `BsonInt32` | `DEFAULT_FILLER_VALUE` | `new BsonInt32(0)` |
| `private static final` | `BsonInt32` | `DEFAULT_ROTATION_VALUE` | `new BsonInt32(0)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `SelectionPrefabSerializer()` |
| `@Nonnull public static` | `BlockSelection` | `deserialize(@Nonnull BsonDocument doc)` |
| `@Nonnull public static` | `BsonDocument` | `serialize(@Nonnull BlockSelection prefab)` |
| `public static` | `int` | `readWorldVersion(@Nonnull BsonDocument document)` |
| `@Nullable public static` | `Holder<EntityStore>` | `legacyEntityDecode(@Nonnull BsonDocument document, int version)` |
| `@Nonnull public static` | `Holder<ChunkStore>` | `legacyStateDecode(@Nonnull BsonDocument document)` |
