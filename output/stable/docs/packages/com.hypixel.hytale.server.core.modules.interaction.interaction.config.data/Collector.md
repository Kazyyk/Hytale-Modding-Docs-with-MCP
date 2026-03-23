---
title: "Collector"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data.Collector"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.data`

```java
public interface Collector
```

Interface for collecting interaction configuration data during interaction tree traversal. Implementations visit interactions in a depth-first pattern using `into`/`outof` for entering/leaving scopes, and `collect` for gathering tagged data at each node.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `start()` | `void` | Called before traversal begins. |
| `into(@Nonnull InteractionContext var1, @Nullable Interaction var2)` | `void` | Enters an interaction scope. |
| `collect(@Nonnull CollectorTag var1, @Nonnull InteractionContext var2, @Nonnull Interaction var3)` | `boolean` | Collects data from an interaction node. Returns true if collection should continue. |
| `outof()` | `void` | Leaves the current interaction scope. |
| `finished()` | `void` | Called after traversal completes. |
