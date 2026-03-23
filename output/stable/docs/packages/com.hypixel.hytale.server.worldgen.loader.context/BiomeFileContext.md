---
title: "BiomeFileContext"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.BiomeFileContext"
api_surface: false
extends: "FileContext<ZoneFileContext>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "context"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.context`

```java
public class BiomeFileContext extends FileContext<ZoneFileContext>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `BiomeFileContext.Type` | `type` |
| `private final` | `String` | `prefix` |
| `private final` | `String` | `suffix` |
| `private final` | `String` | `displayName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BiomeFileContext.Type` | `getType()` |
| `@Nonnull public static` | `BiomeFileContext.Type` | `getBiomeType(@Nonnull AssetPath path)` |
| `public` | `String` | `getPrefix()` |
| `public` | `String` | `getSuffix()` |
| `public` | `String` | `getDisplayName()` |

## Inner Types

- `BiomeFileContext.Type`
