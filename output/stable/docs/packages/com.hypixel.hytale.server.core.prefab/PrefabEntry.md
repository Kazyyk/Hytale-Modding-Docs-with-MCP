---
title: "PrefabEntry"
kind: "record"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabEntry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "prefab"
  - "record"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

```java
public record PrefabEntry(@Nonnull Path path, @Nonnull Path relativePath, @Nullable AssetPack pack, @Nonnull String displayName)
```

Record representing a reference to a prefab file on disk. Tracks the absolute path, relative path within the prefab directory, the owning `AssetPack` (nullable for server prefabs), and a display name. Provides utility methods to determine source (base pack vs. mod pack vs. server) and format display names.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isFromBasePack()` |
| `public` | `boolean` | `isFromAssetPack()` |
| `@Nonnull public` | `String` | `getPackName()` |
| `@Nonnull public` | `String` | `getFileName()` |
| `@Nonnull public` | `String` | `getDisplayNameWithPack()` |
