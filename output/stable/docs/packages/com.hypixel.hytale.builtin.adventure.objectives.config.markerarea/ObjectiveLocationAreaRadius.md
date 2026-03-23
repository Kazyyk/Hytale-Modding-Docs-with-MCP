---
title: "ObjectiveLocationAreaRadius"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea.ObjectiveLocationAreaRadius"
api_surface: false
extends: "ObjectiveLocationMarkerArea"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.markerarea`

```java
public class ObjectiveLocationAreaRadius extends ObjectiveLocationMarkerArea
```

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_ENTRY_RADIUS` | `int` | Static final int field. |
| `DEFAULT_EXIT_RADIUS` | `int` | Static final int field. |
| `entryArea` | `int` | int field. |
| `exitArea` | `int` | int field. |

## Constructors

| Constructor | Description |
|---|---|
| `ObjectiveLocationAreaRadius(int entryRadius, int exitRadius)` | Creates a new ObjectiveLocationAreaRadius instance. |
| `ObjectiveLocationAreaRadius()` | Creates a new ObjectiveLocationAreaRadius instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getEntryArea()` | `int` | public method. |
| `getExitArea()` | `int` | public method. |
| `isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition)` | `boolean` | public method. |
| `computeAreaBoxes()` | `void` | protected method. |
| `toString()` | `String` | public method. |
