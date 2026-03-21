---
title: "OpenProcessingBenchInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.interaction"
fqcn: "com.hypixel.hytale.builtin.crafting.interaction.OpenProcessingBenchInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "crafting"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.crafting.interaction`

```java
public class OpenProcessingBenchInteraction extends SimpleBlockInteraction
```

Block or entity interaction handler for OpenProcessingBench behavior.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull InteractionType type,
        @Nonnull InteractionContext context,
        @Nullable ItemStack itemInHand,
        @Nonnull Vector3i pos,
        @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |
