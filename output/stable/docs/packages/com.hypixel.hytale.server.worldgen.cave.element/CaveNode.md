---
title: "CaveNode"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.element"
fqcn: "com.hypixel.hytale.server.worldgen.cave.element.CaveNode"
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
public class CaveNode implements CaveElement
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `CaveNodeType` | `caveNodeType` |
| `private final` | `CaveNodeShape` | `shape` |
| `private final` | `WorldBounds` | `bounds` |
| `private final` | `int` | `seedOffset` |
| `private final` | `float` | `pitch` |
| `private final` | `float` | `yaw` |
| `private` | `List<CavePrefab>` | `rawCavePrefabs` |
| `private` | `CavePrefab[]` | `cavePrefabs` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getSeedOffset()` |
| `public` | `CaveNodeType` | `getCaveNodeType()` |
| `@Nonnull public` | `CaveNodeShape` | `getShape()` |
| `public` | `CavePrefab[]` | `getCavePrefabs()` |
| `public` | `float` | `getYaw()` |
| `public` | `float` | `getPitch()` |
| `public` | `Vector3d` | `getEnd()` |
| `public` | `void` | `addPrefab(CavePrefab prefab)` |
| `@Nonnull @Override public` | `IWorldBounds` | `getBounds()` |
| `public` | `int` | `getFloorPosition(int seed, double x, double z)` |
| `public` | `int` | `getCeilingPosition(int seed, double x, double z)` |
| `public` | `void` | `forEachChunk(LongConsumer consumer)` |
| `public` | `void` | `compile()` |
| `@Nonnull @Override public` | `String` | `toString()` |
