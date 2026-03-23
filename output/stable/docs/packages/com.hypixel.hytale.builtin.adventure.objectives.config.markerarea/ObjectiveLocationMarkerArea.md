---
title: "ObjectiveLocationMarkerArea"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.config.markerarea.ObjectiveLocationMarkerArea"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.config.markerarea`

```java
public abstract class ObjectiveLocationMarkerArea
```

Class in the markerarea subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `entryAreaBox` | `Box` | Box field. |
| `exitAreaBox` | `Box` | Box field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `isPlayerInEntryArea(@Nonnull Vector3d var1, @Nonnull Vector3d var2)` | `boolean` | public method. |
| `getBoxForEntryArea()` | `Box` | public method. |
| `getBoxForExitArea()` | `Box` | public method. |
| `getRotatedArea(float yaw, float pitch)` | `ObjectiveLocationMarkerArea` | public method. |
| `computeAreaBoxes()` | `void` | protected method. |
| `toString()` | `String` | public method. |
