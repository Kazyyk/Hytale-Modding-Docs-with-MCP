---
title: "UsedTeleporter"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.teleporter.interaction.server"
fqcn: "com.hypixel.hytale.builtin.adventure.teleporter.interaction.server.UsedTeleporter"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.adventure.teleporter.interaction.server`

```java
public class UsedTeleporter implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `destinationWorldUuid` | `UUID` | UUID field. |
| `destinationPosition` | `Vector3d` | Vector3d field. |
| `clearOutXZ` | `double` | double field. |
| `clearOutXZSquared` | `double` | double field. |
| `clearOutY` | `double` | double field. |

## Constructors

| Constructor | Description |
|---|---|
| `UsedTeleporter()` | Creates a new UsedTeleporter instance. |
| `UsedTeleporter(@Nullable UUID destinationWorldUuid, Vector3d destinationPosition, double clearOutXZ, double clearOutY)` | Creates a new UsedTeleporter instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, UsedTeleporter>` | static public method. |
| `getDestinationWorldUuid()` | `UUID` | public method. |
| `getDestinationPosition()` | `Vector3d` | public method. |
| `getClearOutXZ()` | `double` | public method. |
| `getClearOutXZSquared()` | `double` | public method. |
| `getClearOutY()` | `double` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
