---
title: "ZoneFileContext"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.ZoneFileContext"
api_surface: false
extends: "FileContext<FileLoadingContext>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "context"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.context`

```java
public class ZoneFileContext extends FileContext<FileLoadingContext>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `FileContext.Registry<BiomeFileContext>` | `tileBiomes` |
| `private final` | `FileContext.Registry<BiomeFileContext>` | `customBiomes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `FileContext.Registry<BiomeFileContext>` | `getTileBiomes()` |
| `@Nonnull public` | `FileContext.Registry<BiomeFileContext>` | `getCustomBiomes()` |
| `@Nonnull public` | `FileContext.Registry<BiomeFileContext>` | `getBiomes(@Nonnull BiomeFileContext.Type type)` |
| `@Nonnull public` | `ZoneFileContext` | `matchContext(@Nullable JsonElement json, String key)` |
| `@Nonnull public` | `ZoneFileContext` | `matchContext(@Nonnull String filePath)` |
| `@Nonnull protected` | `BiomeFileContext` | `createBiome(String name, Path path, BiomeFileContext.Type type)` |
| `@Nonnull protected` | `BiomeFileContext` | `createBiome(int id, String name, Path path, BiomeFileContext.Type type)` |
| `public` | `` | `ZoneFileContext(int id, String name, Path filepath, FileLoadingContext context)` |

## Inner Types

- `ZoneFileContext.Constants`
