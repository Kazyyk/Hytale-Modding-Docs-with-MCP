---
title: "PatternDirectionality"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality.PatternDirectionality"
api_surface: false
extends: "Directionality"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.directionality`

```java
public class PatternDirectionality extends Directionality
```

Concrete implementation extending `Directionality`.

## Fields

| Field | Type | Description |
|---|---|---|
| `rotations` | `List<PrefabRotation>` | final List<PrefabRotation> field. |
| `south` | `PrefabRotation` | final PrefabRotation field. |
| `north` | `PrefabRotation` | final PrefabRotation field. |
| `east` | `PrefabRotation` | final PrefabRotation field. |
| `west` | `PrefabRotation` | final PrefabRotation field. |
| `southPattern` | `Pattern` | final Pattern field. |
| `northPattern` | `Pattern` | final Pattern field. |
| `eastPattern` | `Pattern` | final Pattern field. |
| `westPattern` | `Pattern` | final Pattern field. |
| `generalPattern` | `Pattern` | final Pattern field. |
| `seedGenerator` | `SeedGenerator` | final SeedGenerator field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getGeneralPattern()` | `Pattern` | public method. |
| `getReadRangeWith(@Nonnull Scanner scanner)` | `Vector3i` | public method. |
| `getPossibleRotations()` | `List<PrefabRotation>` | public method. |
| `getRotationAt(@Nonnull Pattern.Context context)` | `PrefabRotation` | public method. |
