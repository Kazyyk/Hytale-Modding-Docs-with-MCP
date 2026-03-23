---
title: "WeightedAssignments"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions.WeightedAssignments"
api_surface: false
extends: "Assignments"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.propdistributions`

```java
public class WeightedAssignments extends Assignments
```

Concrete implementation extending `Assignments`.

## Fields

| Field | Type | Description |
|---|---|---|
| `weightedDistributions` | `WeightedMap<Assignments>` | final WeightedMap<Assignments> field. |
| `seedGenerator` | `SeedGenerator` | final SeedGenerator field. |
| `runtime` | `int` | final int field. |
| `noneProbability` | `double` | final double field. |

## Constructors

| Constructor | Description |
|---|---|
| `WeightedAssignments(@Nonnull WeightedMap<Assignments> props, int seed, double noneProbability, int runtime)` | Creates a new WeightedAssignments instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge)` | `Prop` | public method. |
| `getRuntime()` | `int` | public method. |
| `getAllPossibleProps()` | `List<Prop>` | public method. |
