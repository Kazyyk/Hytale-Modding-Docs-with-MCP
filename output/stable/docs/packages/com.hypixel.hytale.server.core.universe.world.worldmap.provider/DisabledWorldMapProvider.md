---
title: "DisabledWorldMapProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.provider.DisabledWorldMapProvider"
api_surface: false
extends: null
implements: ["IWorldMapProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldmap"
  - "provider"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.provider`

```java
public class DisabledWorldMapProvider implements IWorldMapProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<DisabledWorldMapProvider>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `IWorldMap` | `getGenerator(World world) throws WorldMapLoadException` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `DisabledWorldMapProvider.DisabledWorldMap`
