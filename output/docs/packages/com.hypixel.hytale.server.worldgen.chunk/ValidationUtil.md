---
title: "ValidationUtil"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.ValidationUtil"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk`

```java
public class ValidationUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `Deque<String>` | `trace` |
| `` | `boolean` | `invalid` |
| `` | `Set<String>` | `encounteredNodes` |
| `` | `PrefabContainer.PrefabContainerEntry[]` | `prefabContainerEntries` |
| `` | `CavePrefabContainer.CavePrefabEntry[]` | `cavePrefabEntries` |
| `` | `CaveNodeType.CaveNodeChildEntry[]` | `children` |
| `` | `CaveNodeType[]` | `nodes` |
| `` | `WorldGenPrefabSupplier[]` | `suppliers` |
| `` | `IPrefabBuffer` | `prefab` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `isInvalid(@Nonnull ZonePatternProvider zonePatternProvider, @Nonnull Executor executor)` |
| `` | `private static boolean` | `isZoneInvalid(@Nonnull Zone zone, @Nonnull Deque<String> trace)` |
| `` | `private static boolean` | `isBiomeInvalid(@Nonnull Biome biome, @Nonnull Deque<String> trace)` |
| `` | `private static boolean` | `isCaveNodeInvalid(@Nonnull CaveNodeType caveNodeType, @Nonnull Set<String> encounteredNodes, @Nonnull Deque<String> trace)` |
| `` | `private static boolean` | `arePrefabsInvalid(@Nonnull IWeightedMap<WorldGenPrefabSupplier> prefabs, @Nonnull Deque<String> trace)` |
| `` | `private static boolean` | `isChildPrefabInvalid(@Nonnull PrefabBuffer.ChildPrefab childMarker, @Nonnull WorldGenPrefabLoader loader, @Nonnull Deque<String> trace)` |
