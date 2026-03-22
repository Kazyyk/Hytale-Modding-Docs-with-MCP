---
title: "CaveNodeType"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.CaveNodeType"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cave"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave`

```java
public class CaveNodeType
```

Defines a type of cave node including its shape generator, fill materials, cover entries, prefab containers, child entries, and priority.

## Constants

| Type | Name |
|---|---|
| `CaveNodeType[]` | `EMPTY_ARRAY` |
| `CaveNodeType.CaveNodeChildEntry[]` | `EMPTY_ARRAY` |
| `CaveNodeType.CaveNodeCoverEntry[]` | `EMPTY_ARRAY` |
| `CaveNodeType.CaveNodeCoverEntry.Entry[]` | `EMPTY_ARRAY` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getName()` |
| `public` | `CavePrefabContainer` | `getPrefabContainer()` |
| `public` | `void` | `setChildren(@Nonnull CaveNodeType.CaveNodeChildEntry[] children)` |
| `public` | `ICoordinateCondition` | `getHeightCondition()` |
| `public` | `IDoubleRange` | `getChildrenCountBounds()` |
| `public` | `BlockFluidEntry` | `getFilling(@Nonnull Random random)` |
| `public` | `CaveNodeShape` | `generateCaveNodeShape(Random random, CaveType caveType, CaveNode parentNode, CaveNodeType.CaveNodeChildEntry childEntry, Vector3d origin, float yaw, float pitch)` |
| `public` | `CaveNodeType.CaveNodeCoverEntry[]` | `getCovers()` |
| `public` | `CaveNodeType.CaveNodeChildEntry[]` | `getChildren()` |
| `public` | `int` | `getPriority()` |
| `public` | `boolean` | `hasEnvironment()` |
| `public` | `int` | `getEnvironment()` |
| `public` | `IWeightedMap<CaveNodeType>` | `getTypes()` |
| `public` | `Vector3d` | `getAnchor()` |
| `public` | `Vector3d` | `getOffset()` |
| `public` | `PrefabRotation` | `getRotation(@Nonnull Random random)` |
| `public` | `IDoubleRange` | `getChildrenLimit()` |
| `public` | `IDoubleRange` | `getRepeat()` |
| `public` | `CaveNodeType.CaveNodeChildEntry.OrientationModifier` | `getPitchModifier()` |
| `public` | `CaveNodeType.CaveNodeChildEntry.OrientationModifier` | `getYawModifier()` |
| `public` | `double` | `getChance()` |
| `public` | `CaveYawMode` | `getYawMode()` |
| `public` | `CaveNodeType.CaveNodeCoverEntry.Entry` | `get(Random random)` |
| `public` | `ICoordinateCondition` | `getMapCondition()` |
| `public` | `ICoordinateCondition` | `getDensityCondition()` |
| `public` | `IBlockFluidCondition` | `getParentCondition()` |
| `public` | `CaveNodeType.CaveNodeCoverType` | `getType()` |
| `public` | `BlockFluidEntry` | `getEntry()` |
| `public` | `String` | `toString()` |
