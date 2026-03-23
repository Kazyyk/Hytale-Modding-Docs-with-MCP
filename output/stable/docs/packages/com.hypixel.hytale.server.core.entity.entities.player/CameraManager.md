---
title: "CameraManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.CameraManager"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "entity"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player`

```java
public class CameraManager implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `lastScreenPoint` | `Vector2d` | Vector2d field. |
| `lastTargetBlock` | `Vector3i` | Vector3i field. |

## Constructors

| Constructor | Description |
|---|---|
| `CameraManager()` | Creates a new CameraManager instance. |
| `CameraManager(@Nonnull CameraManager other)` | Creates a new CameraManager instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, CameraManager>` | static public method. |
| `resetCamera(@Nonnull PlayerRef ref)` | `void` | public method. |
| `handleMouseButtonState(MouseButtonType mouseButtonType, MouseButtonState state, Vector3i targetBlock)` | `void` | public method. |
| `getMouseButtonState(MouseButtonType mouseButtonType)` | `MouseButtonState` | public method. |
| `getLastMouseButtonPressedPosition(MouseButtonType mouseButtonType)` | `Vector3i` | public method. |
| `getLastMouseButtonReleasedPosition(MouseButtonType mouseButtonType)` | `Vector3i` | public method. |
| `setLastScreenPoint(Vector2d lastScreenPoint)` | `void` | public method. |
| `getLastScreenPoint()` | `Vector2d` | public method. |
| `setLastBlockPosition(Vector3i targetBlock)` | `void` | public method. |
| `getLastTargetBlock()` | `Vector3i` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
| `toString()` | `String` | public method. |
