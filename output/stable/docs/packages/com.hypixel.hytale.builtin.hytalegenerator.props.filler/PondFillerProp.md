---
title: "PondFillerProp"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.filler"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.filler.PondFillerProp"
api_surface: false
extends: "Prop"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.filler`

```java
public class PondFillerProp extends Prop
```

Concrete implementation extending `Prop`.

## Fields

| Field | Type | Description |
|---|---|---|
| `TRAVERSED` | `int` | Static final int field. |
| `LEAKS` | `int` | Static final int field. |
| `SOLID` | `int` | Static final int field. |
| `STACKED` | `int` | Static final int field. |
| `boundingMin` | `Vector3i` | final Vector3i field. |
| `boundingMax` | `Vector3i` | final Vector3i field. |
| `filledMaterialProvider` | `MaterialProvider<Material>` | final MaterialProvider<Material> field. |
| `solidSet` | `MaterialSet` | final MaterialSet field. |
| `scanner` | `Scanner` | final Scanner field. |
| `pattern` | `Pattern` | final Pattern field. |
| `contextDependency` | `ContextDependency` | final ContextDependency field. |
| `readBounds_voxelGrid` | `Bounds3i` | final Bounds3i field. |
| `writeBounds_voxelGrid` | `Bounds3i` | final Bounds3i field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `scan(@Nonnull Vector3i position, @Nonnull VoxelSpace<Material> materialSpace, @Nonnull WorkerIndexer.Id id)` | `FillerPropScanResult` | public method. |
| `renderFluidBlocks(@Nonnull Vector3i origin, @Nonnull VoxelSpace<Material> materialSpace)` | `List<Vector3i>` | private method. |
| `place(@Nonnull Prop.Context context)` | `void` | public method. |
| `getContextDependency()` | `ContextDependency` | public method. |
| `getReadBounds_voxelGrid()` | `Bounds3i` | public method. |
| `getWriteBounds_voxelGrid()` | `Bounds3i` | public method. |
| `isTraversed(int maskValue)` | `boolean` | static private method. |
| `isLeaks(int maskValue)` | `boolean` | static private method. |
| `isSolid(int maskValue)` | `boolean` | static private method. |
| `isStacked(int maskValue)` | `boolean` | static private method. |
