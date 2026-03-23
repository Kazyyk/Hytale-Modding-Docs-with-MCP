---
title: "HorizontalSelector"
kind: "enum"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.HorizontalSelector"
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
public class HorizontalSelector extends SelectorType
```

A selector that sweeps a horizontal arc over time, detecting entities and blocks within a frustum-shaped volume. Supports configurable arc length, direction (left/right), distance range, vertical extension, rotation offsets, and optional line-of-sight testing.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<HorizontalSelector> CODEC =` | `BuilderCodec.builder(HorizontalSelector.class, HorizontalSelector::new, BASE_CODEC)` |
| `public` | `Selector` | `newSelector()` |
| `public` | `com.hypixel.hytale.protocol.Selector` | `toPacket()` |
| `public static final` | `EnumCodec<HorizontalSelector.Direction> CODEC = new` | `EnumCodec<>(HorizontalSelector.Direction.class)` |
| `public` | `void` | `tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, float time, float runTime)` |
| `public` | `void` | `selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )` |
| `public` | `void` | `selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> attacker, TriIntConsumer consumer)` |
