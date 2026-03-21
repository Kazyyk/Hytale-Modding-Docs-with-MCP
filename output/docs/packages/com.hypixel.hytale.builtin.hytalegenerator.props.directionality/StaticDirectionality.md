---
title: "StaticDirectionality"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality.StaticDirectionality"
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
public class StaticDirectionality extends Directionality
```

Concrete implementation extending `Directionality`.

## Fields

| Field | Type | Description |
|---|---|---|
| `possibleRotations` | `List<PrefabRotation>` | final List<PrefabRotation> field. |
| `rotation` | `PrefabRotation` | final PrefabRotation field. |
| `pattern` | `Pattern` | final Pattern field. |

## Constructors

| Constructor | Description |
|---|---|
| `StaticDirectionality(@Nonnull PrefabRotation rotation, @Nonnull Pattern pattern)` | Creates a new StaticDirectionality instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getRotationAt(@Nonnull Pattern.Context context)` | `PrefabRotation` | public method. |
| `getGeneralPattern()` | `Pattern` | public method. |
| `getReadRangeWith(@Nonnull Scanner scanner)` | `Vector3i` | public method. |
| `getPossibleRotations()` | `List<PrefabRotation>` | public method. |
