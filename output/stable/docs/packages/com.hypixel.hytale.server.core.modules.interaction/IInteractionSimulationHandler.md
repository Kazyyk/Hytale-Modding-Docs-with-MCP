---
title: "IInteractionSimulationHandler"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.IInteractionSimulationHandler"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "simulation"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public interface IInteractionSimulationHandler
```

Interface for controlling how interactions are simulated on the server side (for NPCs) or predicted on the client side. Provides methods for setting button state, querying charge status, and computing charge values. The default implementation is [InteractionSimulationHandler](InteractionSimulationHandler.md).

## Methods

```java
void setState(InteractionType var1, boolean var2)
```

Sets the pressed state for an interaction type.

```java
boolean isCharging(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)
```

Returns whether the given interaction type is currently in a charging state.

```java
boolean shouldCancelCharging(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)
```

Returns whether an in-progress charge should be cancelled.

```java
float getChargeValue(boolean var1, float var2, InteractionType var3, InteractionContext var4, Ref<EntityStore> var5, CooldownHandler var6)
```

Returns the current charge progress value.
