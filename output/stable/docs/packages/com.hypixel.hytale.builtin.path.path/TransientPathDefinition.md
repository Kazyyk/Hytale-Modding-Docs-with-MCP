---
title: "TransientPathDefinition"
kind: "class"
package: "com.hypixel.hytale.builtin.path.path"
fqcn: "com.hypixel.hytale.builtin.path.path.TransientPathDefinition"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "pathing"
---

**Package:** `com.hypixel.hytale.builtin.path.path`

```java
public class TransientPathDefinition
```

Class in the path subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `waypointDefinitions` | `List<RelativeWaypointDefinition>` | final List<RelativeWaypointDefinition> field. |
| `scale` | `double` | final double field. |

## Constructors

| Constructor | Description |
|---|---|
| `TransientPathDefinition(List<RelativeWaypointDefinition> waypointDefinitions, double scale)` | Creates a new TransientPathDefinition instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `buildPath(@Nonnull Vector3d position, @Nonnull Vector3f rotation)` | `IPath<SimplePathWaypoint>` | public method. |
