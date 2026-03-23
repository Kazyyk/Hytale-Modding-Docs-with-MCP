---
title: "SensorCanInteract"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.SensorCanInteract"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.interaction`

```java
public class SensorCanInteract extends SensorBase
```

Concrete implementation extending `SensorBase`.

## Fields

| Field | Type | Description |
|---|---|---|
| `viewCone` | `float` | final float field. |
| `attitudes` | `EnumSet<Attitude>` | final EnumSet<Attitude> field. |

## Constructors

| Constructor | Description |
|---|---|
| `SensorCanInteract(@Nonnull BuilderSensorCanInteract builder, @Nonnull BuilderSupport support)` | Creates a new SensorCanInteract instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` | `boolean` | public method. |
| `registerWithSupport(@Nonnull Role role)` | `void` | public method. |
| `getSensorInfo()` | `InfoProvider` | public method. |
