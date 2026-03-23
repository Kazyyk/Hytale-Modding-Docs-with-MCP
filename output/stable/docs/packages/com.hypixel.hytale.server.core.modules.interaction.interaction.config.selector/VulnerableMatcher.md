---
title: "VulnerableMatcher"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.selector.VulnerableMatcher"
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
public class VulnerableMatcher extends SelectInteraction.EntityMatcher
```

An entity matcher that filters targets to match only entities that are not invulnerable (do not have the `Invulnerable` component).

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<VulnerableMatcher> CODEC =` | `BuilderCodec.builder(VulnerableMatcher.class, VulnerableMatcher::new, BASE_CODEC)` |
| `public` | `boolean` | `test0(Ref<EntityStore> sourceRef, Ref<EntityStore> targetRef, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `EntityMatcher` | `toPacket()` |
