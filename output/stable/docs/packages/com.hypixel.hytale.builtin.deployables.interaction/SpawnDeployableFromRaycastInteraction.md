---
title: "SpawnDeployableFromRaycastInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.interaction"
fqcn: "com.hypixel.hytale.builtin.deployables.interaction.SpawnDeployableFromRaycastInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
  - "deployables"
---

**Package:** `com.hypixel.hytale.builtin.deployables.interaction`

```java
public class SpawnDeployableFromRaycastInteraction extends SimpleInstantInteraction
```

Interaction handler extending `SimpleInstantInteraction`.

## Fields

| Field | Type | Description |
|---|---|---|
| `unknownEntityStats` | `Object2FloatMap<String>` | Object2FloatMap<String> field. |
| `entityStats` | `Int2FloatMap` | Int2FloatMap field. |
| `maxPlacementDistance` | `float` | float field. |
| `config` | `DeployableConfig` | DeployableConfig field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `processConfig()` | `void` | private method. |
| `isSurface(@Nonnull Vector3f normal)` | `boolean` | static private method. |
| `needsRemoteSync()` | `boolean` | public method. |
| `getWaitForDataFrom()` | `WaitForDataFrom` | public method. |
| `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` | `void` | protected method. |
| `canAfford(@Nonnull Ref<EntityStore> entityRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `boolean` | protected method. |
| `generatePacket()` | `Interaction` | protected method. |
| `configurePacket(Interaction packet)` | `void` | protected method. |
