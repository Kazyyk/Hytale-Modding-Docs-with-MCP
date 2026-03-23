---
title: "SandwichAssignments"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions.SandwichAssignments"
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
public class SandwichAssignments extends Assignments
```

Concrete implementation extending `Assignments`.

## Fields

| Field | Type | Description |
|---|---|---|
| `verticalDelimiters` | `List<SandwichAssignments.VerticalDelimiter>` | final List<SandwichAssignments.VerticalDelimiter> field. |
| `runtime` | `int` | final int field. |

## Constructors

| Constructor | Description |
|---|---|
| `SandwichAssignments(@Nonnull List<SandwichAssignments.VerticalDelimiter> verticalDelimiters, int runtime)` | Creates a new SandwichAssignments instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge)` | `Prop` | public method. |
| `getRuntime()` | `int` | public method. |
| `getAllPossibleProps()` | `List<Prop>` | public method. |
