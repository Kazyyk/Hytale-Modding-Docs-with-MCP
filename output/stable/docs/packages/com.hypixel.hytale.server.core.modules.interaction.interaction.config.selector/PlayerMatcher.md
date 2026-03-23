---
title: "PlayerMatcher"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.PlayerMatcher"
api_surface: false
extends: "SelectInteraction.EntityMatcher"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "selector"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector`

```java
public class PlayerMatcher extends SelectInteraction.EntityMatcher
```

An entity matcher that filters targets to only match player entities by checking for the `Player` component type.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<PlayerMatcher> CODEC =` | `BuilderCodec.builder(PlayerMatcher.class, PlayerMatcher::new, BASE_CODEC)` |
| `public` | `boolean` | `test0(Ref<EntityStore> sourceRef, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `EntityMatcher` | `toPacket()` |
