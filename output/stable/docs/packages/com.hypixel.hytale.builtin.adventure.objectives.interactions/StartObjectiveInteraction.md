---
title: "StartObjectiveInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.interactions.StartObjectiveInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.interactions`

```java
public class StartObjectiveInteraction extends SimpleInstantInteraction
```

Interaction handler extending `SimpleInstantInteraction`.

## Fields

| Field | Type | Description |
|---|---|---|
| `objectiveTypeSetup` | `ObjectiveTypeSetup` | ObjectiveTypeSetup field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` | `void` | protected method. |
| `startObjective(@Nonnull PlayerRef player, @Nonnull InteractionContext context, @Nonnull ItemStack itemStack, @Nonnull Store<EntityStore> store)` | `void` | private method. |
| `toString()` | `String` | public method. |
