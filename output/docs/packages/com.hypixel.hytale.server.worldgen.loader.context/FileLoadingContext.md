---
title: "FileLoadingContext"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.FileLoadingContext"
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
public class FileLoadingContext extends FileContext<FileLoadingContext>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `FileContext.Registry<ZoneFileContext>` | `zones` |
| `private final` | `FileContext.Registry<PrefabCategory>` | `prefabCategories` |
| `private` | `int` | `zoneIdCounter` |
| `private` | `int` | `biomeIdCounter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `FileLoadingContext` | `getParentContext()` |
| `@Nonnull public` | `FileContext.Registry<ZoneFileContext>` | `getZones()` |
| `@Nonnull public` | `FileContext.Registry<PrefabCategory>` | `getPrefabCategories()` |
| `@Nonnull protected` | `ZoneFileContext` | `createZone(String name, Path path)` |
| `@Nonnull protected` | `ZoneFileContext` | `createZone(int id, String name, Path path)` |
| `protected` | `int` | `nextZoneId()` |
| `protected` | `int` | `nextBiomeId()` |
| `protected` | `int` | `updateZoneId(int id)` |
| `protected` | `int` | `updateBiomeId(int id)` |
| `protected static` | `void` | `validateId(int id, int currentId, String type)` |
| `public` | `` | `FileLoadingContext(@Nonnull Path filepath)` |

## Inner Types

- `FileLoadingContext.Constants`
