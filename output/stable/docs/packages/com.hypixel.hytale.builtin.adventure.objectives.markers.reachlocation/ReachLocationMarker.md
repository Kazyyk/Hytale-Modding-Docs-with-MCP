---
title: "ReachLocationMarker"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation.ReachLocationMarker"
api_surface: false
extends: null
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "objectives"
  - "markers"
  - "reachlocation"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation`

```java
public class ReachLocationMarker implements Component<EntityStore>
```

An `EntityStore` component.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `markerId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ComponentType<EntityStore, ReachLocationMarker>` | `getComponentType()` |
| `` | `public String` | `getMarkerId()` |
| `@Nullable public` | `String` | `getLocationName()` |
| `@Nonnull public` | `Set<UUID>` | `getPlayers()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
