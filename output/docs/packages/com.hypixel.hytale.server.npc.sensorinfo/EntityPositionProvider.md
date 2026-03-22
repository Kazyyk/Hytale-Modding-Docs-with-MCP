---
title: "EntityPositionProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.EntityPositionProvider"
api_surface: false
extends: "PositionProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public class EntityPositionProvider extends PositionProvider
```

Concrete implementation extending `PositionProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `target` | `Ref<EntityStore>` | Ref<EntityStore> field. |

## Constructors

| Constructor | Description |
|---|---|
| `EntityPositionProvider()` | Creates a new EntityPositionProvider instance. |
| `EntityPositionProvider(ParameterProvider parameterProvider)` | Creates a new EntityPositionProvider instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `clear()` | `void` | public method. |
| `setTarget(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `Ref<EntityStore>` | public method. |
| `getTarget()` | `Ref<EntityStore>` | public method. |
| `hasPosition()` | `boolean` | public method. |
