---
title: "TeleportHistory"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.components"
fqcn: "com.hypixel.hytale.builtin.teleport.components.TeleportHistory"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "teleport"
---

**Package:** `com.hypixel.hytale.builtin.teleport.components`

```java
public class TeleportHistory implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `MAX_TELEPORT_HISTORY` | `int` | Static final int field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, TeleportHistory>` | static public method. |
| `forward(@Nonnull Ref<EntityStore> ref, int count)` | `void` | public method. |
| `back(@Nonnull Ref<EntityStore> ref, int count)` | `void` | public method. |
| `getForwardSize()` | `int` | public method. |
| `getBackSize()` | `int` | public method. |
| `append(@Nonnull World world, @Nonnull Vector3d pos, @Nonnull Vector3f rotation, @Nonnull String key)` | `void` | public method. |
| `toString()` | `String` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
