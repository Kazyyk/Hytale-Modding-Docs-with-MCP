---
title: "RandomDirectionality"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality.RandomDirectionality"
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
public class RandomDirectionality extends Directionality
```

Concrete implementation extending `Directionality`.

## Fields

| Field | Type | Description |
|---|---|---|
| `rotations` | `List<PrefabRotation>` | final List<PrefabRotation> field. |
| `pattern` | `Pattern` | final Pattern field. |
| `seedGenerator` | `SeedGenerator` | final SeedGenerator field. |

## Constructors

| Constructor | Description |
|---|---|
| `RandomDirectionality(@Nonnull Pattern pattern, int seed)` | Creates a new RandomDirectionality instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getGeneralPattern()` | `Pattern` | public method. |
| `getReadRangeWith(@Nonnull Scanner scanner)` | `Vector3i` | public method. |
| `getPossibleRotations()` | `List<PrefabRotation>` | public method. |
| `getRotationAt(@Nonnull Pattern.Context context)` | `PrefabRotation` | public method. |
