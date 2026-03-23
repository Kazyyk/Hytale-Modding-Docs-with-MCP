---
title: "ClientSourcedSelector"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.ClientSourcedSelector"
api_surface: false
extends: ~
implements: ["Selector"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "selector"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector`

```java
public class ClientSourcedSelector implements Selector
```

Deprecated. A selector that uses client-reported hit entities from the interaction context rather than performing server-side detection. Wraps a parent selector for block selection.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, float time, float runTime)` |
| `public` | `void` | `selectTargetEntities( CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, BiConsumer<Ref<EntityStore>, Vector4d> consumer, Predicate<Ref<EntityStore>> filter )` |
| `public` | `void` | `selectTargetBlocks(CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref, TriIntConsumer consumer)` |
