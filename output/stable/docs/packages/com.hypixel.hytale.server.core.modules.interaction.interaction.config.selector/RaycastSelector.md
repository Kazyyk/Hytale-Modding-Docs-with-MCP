---
title: "RaycastSelector"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.RaycastSelector"
api_surface: false
extends: "SelectorType"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "selector"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector`

```java
public class RaycastSelector extends SelectorType
```

A selector that casts a ray from the attacker in their look direction to find the first entity or block hit. Supports configurable distance, offset, fluid/collision filtering, and block tag filtering.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<RaycastSelector> CODEC =` | `BuilderCodec.builder(RaycastSelector.class, RaycastSelector::new, BASE_CODEC)` |
| `public` | `Selector` | `newSelector()` |
| `public` | `Vector3f` | `getOffset()` |
| `public` | `Vector3d` | `selectTargetPosition(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker)` |
| `public` | `com.hypixel.hytale.protocol.Selector` | `toPacket()` |
| `public` | `Vector4d hitPosition = new` | `Vector4d()` |
| `public` | `void` | `tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, float time, float runTime)` |
| `public` | `void` | `selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )` |
| `public` | `void` | `selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, TriIntConsumer consumer)` |
