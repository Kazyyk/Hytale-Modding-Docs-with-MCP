---
title: "BuilderSensorCanInteract"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.interaction.builders.BuilderSensorCanInteract"
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
public class BuilderSensorCanInteract extends BuilderSensorBase
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
| `getViewSectorRadians(@Nonnull BuilderSupport builderSupport)` | `float` | public method. |
| `getAttitudes(@Nonnull BuilderSupport support)` | `EnumSet<Attitude>` | public method. |
