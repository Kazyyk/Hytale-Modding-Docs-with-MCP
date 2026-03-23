---
title: "PrefabProp"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.prefab"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.prefab.PrefabProp"
api_surface: false
extends: "Prop"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "props"
  - "prefab"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.prefab`

```java
public class PrefabProp extends Prop
```

Extends `Prop` to provide PrefabProp functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `WeightedMap<List<PrefabBuffer>>` | `prefabPool` |  |
| `@Nonnull private final` | `Scanner` | `scanner` |  |
| `private` | `ContextDependency` | `contextDependency` |  |
| `@Nonnull private final` | `MaterialCache` | `materialCache` |  |
| `@Nonnull private final` | `SeedGenerator` | `seedGenerator` |  |
| `@Nonnull private final` | `BlockMask` | `materialMask` |  |
| `@Nonnull private final` | `Directionality` | `directionality` |  |
| `@Nonnull private final` | `Bounds3i` | `readBounds_voxelGrid` |  |
| `@Nonnull private final` | `Bounds3i` | `writeBounds_voxelGrid` |  |
| `@Nonnull private final` | `Bounds3i` | `prefabBounds_voxelGrid` |  |
| `@Nonnull private final` | `List<PrefabProp>` | `childProps` |  |
| `@Nonnull private final` | `List<RotatedPosition>` | `childPositions` |  |
| `@Nonnull private final` | `Function<String, List<PrefabBuffer>>` | `childPrefabLoader` |  |
| `private final` | `Scanner` | `moldingScanner` |  |
| `private final` | `Pattern` | `moldingPattern` |  |
| `private final` | `MoldingDirection` | `moldingDirection` |  |
| `private final` | `boolean` | `moldChildren` |  |
| `private final` | `int` | `prefabId` | `this.hashCode()` |
| `private` | `boolean` | `loadEntities` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PrefabProp(@Nonnull WeightedMap<List<PrefabBuffer>> prefabPool,
        @Nonnull Scanner scanner,
        @Nonnull Directionality directionality,
        @Nonnull MaterialCache materialCache,
        @Nonnull BlockMask materialMask,
        @Nonnull PrefabMoldingConfiguration prefabMoldingConfiguration,
        @Nullable Function<String, List<PrefabBuffer>> childPrefabLoader,
        @Nonnull SeedBox seedBox,
        boolean loadEntities)` |
| `@Nonnull private` | `Vector3i` | `getWriteRange(@Nonnull PrefabBuffer.PrefabBufferAccessor prefabAccess)` |
| `@Nonnull @Override public` | `ScanResult` | `scan(@Nonnull Vector3i position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull WorkerIndexer.Id id)` |
| `@Override public` | `void` | `place(@Nonnull Prop.Context context)` |
| `private` | `PrefabBuffer` | `pickPrefab(@Nonnull Random rand)` |
| `private` | `void` | `place(@Nonnull RotatedPosition position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull EntityContainer entityBuffer, @Nonnull WorkerIndexer.Id id)` |
| `@Override public` | `ContextDependency` | `getContextDependency()` |
| `@Override public` | `Bounds3i` | `getReadBounds_voxelGrid()` |
| `@Nonnull @Override public` | `Bounds3i` | `getWriteBounds_voxelGrid()` |
