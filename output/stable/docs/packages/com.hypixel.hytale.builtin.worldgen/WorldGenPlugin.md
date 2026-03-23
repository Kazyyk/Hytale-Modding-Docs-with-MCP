---
title: "WorldGenPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.worldgen"
fqcn: "com.hypixel.hytale.builtin.worldgen.WorldGenPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "worldgen"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.worldgen`

```java
public class WorldGenPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `VERSIONS_DIR_NAME` |
| `private static final` | `String` | `MANIFEST_FILENAME` |
| `private static` | `WorldGenPlugin` | `instance` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldGenPlugin(@Nonnull JavaPluginInit init)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `WorldGenPlugin` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `private static` | `List<WorldGenPlugin.Version>` | `loadVersionPacks(@Nonnull AssetModule assets)` |
| `private static` | `void` | `validateVersion(@Nonnull WorldGenPlugin.Version version, @Nonnull List<WorldGenPlugin.Version> versions)` |
| `@Nullable private static` | `String` | `getWorldConfigName(@Nonnull Path packPath, @Nonnull Path assetPath)` |
| `@Nullable private static` | `PluginManifest` | `loadManifest(@Nonnull Path manifestPath)` |
| `public static` | `Path` | `getVersionsPath()` |

## Inner Types

- `WorldGenPlugin.Version`
