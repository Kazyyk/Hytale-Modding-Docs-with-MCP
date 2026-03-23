---
title: "CachedPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.cached"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.cached.CachedPositionProvider"
api_surface: false
extends: "PositionProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "positionproviders"
  - "cached"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.positionproviders.cached`

```java
public class CachedPositionProvider extends PositionProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PositionProvider` | `positionProvider` |
| `private final` | `int` | `sectionSize` |
| `private` | `CacheThreadMemory` | `cache` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `positionsIn(PositionProvider.Context context)` |
| `public` | `void` | `get(PositionProvider.Context context)` |
| `@Nonnull private` | `Vector3i` | `sectionAddress(Vector3d pointer)` |
| `@Nonnull private` | `Vector3d` | `sectionMin(Vector3i sectionAddress)` |
| `private` | `int` | `toSectionAddress(double position)` |
| `public` | `int` | `sectionFloor(int voxelAddress)` |
