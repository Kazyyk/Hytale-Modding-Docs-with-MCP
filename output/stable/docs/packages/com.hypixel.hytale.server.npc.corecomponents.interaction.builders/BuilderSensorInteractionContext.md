---
title: "BuilderSensorInteractionContext"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders.BuilderSensorInteractionContext"
api_surface: false
extends: "BuilderSensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.interaction.builders`

```java
public class BuilderSensorInteractionContext extends BuilderSensorBase
```

NPC behavior tree builder for a sensor node. Configures detection or query logic.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getShortDescription()` | `String` | public method. |
| `getLongDescription()` | `String` | public method. |
| `build(@Nonnull BuilderSupport builderSupport)` | `Sensor` | public method. |
| `getBuilderDescriptorState()` | `BuilderDescriptorState` | public method. |
| `readConfig(@Nonnull JsonElement data)` | `Builder<Sensor>` | public method. |
| `getInteractionContext(@Nonnull BuilderSupport support)` | `String` | public method. |
