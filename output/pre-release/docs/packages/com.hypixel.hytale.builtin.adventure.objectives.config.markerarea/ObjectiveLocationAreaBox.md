---
title: "ObjectiveLocationAreaBox"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea.ObjectiveLocationAreaBox"
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
public class ObjectiveLocationAreaBox extends ObjectiveLocationMarkerArea
```

Concrete implementation extending `ObjectiveLocationMarkerArea`.

## Fields

| Field | Type | Description |
|---|---|---|
| `entryArea` | `Box` | Box field. |
| `exitArea` | `Box` | Box field. |

## Constructors

| Constructor | Description |
|---|---|
| `ObjectiveLocationAreaBox(Box entryBox, Box exitBox)` | Creates a new ObjectiveLocationAreaBox instance. |
| `ObjectiveLocationAreaBox()` | Creates a new ObjectiveLocationAreaBox instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getEntryArea()` | `Box` | public method. |
| `getExitArea()` | `Box` | public method. |
| `isPlayerInEntryArea(@Nonnull Vector3d playerPosition, @Nonnull Vector3d markerPosition)` | `boolean` | public method. |
| `getRotatedArea(float yaw, float pitch)` | `ObjectiveLocationMarkerArea` | public method. |
| `computeAreaBoxes()` | `void` | protected method. |
| `toString()` | `String` | public method. |
