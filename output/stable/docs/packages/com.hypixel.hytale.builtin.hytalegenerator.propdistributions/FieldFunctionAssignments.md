---
title: "FieldFunctionAssignments"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.propdistributions.FieldFunctionAssignments"
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
public class FieldFunctionAssignments extends Assignments
```

Concrete implementation extending `Assignments`.

## Fields

| Field | Type | Description |
|---|---|---|
| `density` | `Density` | final Density field. |
| `fieldDelimiters` | `List<FieldFunctionAssignments.FieldDelimiter>` | final List<FieldFunctionAssignments.FieldDelimiter> field. |
| `runtime` | `int` | final int field. |

## Constructors

| Constructor | Description |
|---|---|
| `FieldFunctionAssignments(@Nonnull Density functionTree, @Nonnull List<FieldFunctionAssignments.FieldDelimiter> fieldDelimiters, int runtime)` | Creates a new FieldFunctionAssignments instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge)` | `Prop` | public method. |
| `getRuntime()` | `int` | public method. |
| `getAllPossibleProps()` | `List<Prop>` | public method. |
