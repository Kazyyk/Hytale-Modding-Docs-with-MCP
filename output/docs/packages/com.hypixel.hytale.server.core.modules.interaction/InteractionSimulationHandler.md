---
title: "InteractionSimulationHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.InteractionSimulationHandler"
api_surface: true
extends: ~
implements:
  - "IInteractionSimulationHandler"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "simulation"
  - "charging"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public class InteractionSimulationHandler implements IInteractionSimulationHandler
```

Default implementation of [IInteractionSimulationHandler](IInteractionSimulationHandler.md) used for NPC/server-side interaction simulation. Tracks a simple boolean pressed state per `InteractionType`. Charging is considered active as long as the corresponding button is held down, and the charge value equals elapsed time.

## Instance Methods

```java
@Override
public void setState(@Nonnull InteractionType type, boolean state)
```

Sets the pressed state for the given interaction type.

```java
@Override
public boolean isCharging(boolean firstRun, float time, @Nonnull InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)
```

Returns `true` if the interaction type's button is currently held down.

```java
@Override
public boolean shouldCancelCharging(boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)
```

Always returns `false` -- simulation handlers never cancel charging.

```java
@Override
public float getChargeValue(boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler)
```

Returns the elapsed time as the charge value.
