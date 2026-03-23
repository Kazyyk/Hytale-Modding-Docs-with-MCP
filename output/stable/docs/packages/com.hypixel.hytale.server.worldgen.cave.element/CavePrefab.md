---
title: "CavePrefab"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.element"
fqcn: "com.hypixel.hytale.server.worldgen.cave.element.CavePrefab"
api_surface: true
extends: null
implements: ["CaveElement"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "cave"
  - "element"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.element`

```java
public class CavePrefab implements CaveElement
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `WorldGenPrefabSupplier` | `prefabSupplier` |
| `private final` | `PrefabRotation` | `rotation` |
| `private final` | `IIntCondition` | `biomeMask` |
| `private final` | `BlockMaskCondition` | `blockMask` |
| `private final` | `IWorldBounds` | `bounds` |
| `private final` | `int` | `x` |
| `private final` | `int` | `y` |
| `private final` | `int` | `z` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `WorldGenPrefabSupplier` | `getPrefab()` |
| `@Nonnull public` | `PrefabRotation` | `getRotation()` |
| `public` | `IIntCondition` | `getBiomeMask()` |
| `public` | `BlockMaskCondition` | `getConfiguration()` |
| `public` | `int` | `getX()` |
| `public` | `int` | `getY()` |
| `public` | `int` | `getZ()` |
| `@Nonnull @Override public` | `IWorldBounds` | `getBounds()` |
