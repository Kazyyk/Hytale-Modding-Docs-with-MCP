---
title: "NPCInteractionSimulationHandler"
kind: "class"
package: "com.hypixel.hytale.server.npc.interactions"
fqcn: "com.hypixel.hytale.server.npc.interactions.NPCInteractionSimulationHandler"
api_surface: false
extends: null
implements:
  - "IInteractionSimulationHandler"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.interactions`

```java
public class NPCInteractionSimulationHandler implements IInteractionSimulationHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `float` | `requestedChargeTime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setState(InteractionType type, boolean state)` |
| `public` | `boolean` | `isCharging( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )` |
| `public` | `boolean` | `shouldCancelCharging( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )` |
| `public` | `float` | `getChargeValue( boolean firstRun, float time, InteractionType type, InteractionContext context, Ref<EntityStore> ref, CooldownHandler cooldownHandler )` |
| `public` | `void` | `requestChargeTime(float chargeTime)` |
