---
title: "ListCollector"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.data.ListCollector"
api_surface: false
extends: ~
implements: 
  - "Collector"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.data`

```java
public class ListCollector<T> implements Collector
```

Implementation of `Collector`.

## Fields

| Field | Type | Description |
|---|---|---|
| `function` | `TriFunction<CollectorTag, InteractionContext, Interaction, T>` | final TriFunction<CollectorTag, InteractionContext, Interaction, T> field. |
| `list` | `List<T>` | List<T> field. |

## Constructors

| Constructor | Description |
|---|---|
| `ListCollector(TriFunction<CollectorTag, InteractionContext, Interaction, T> function)` | Creates a new ListCollector instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getList()` | `List<T>` | public method. |
| `start()` | `void` | public method. |
| `into(@Nonnull InteractionContext context, Interaction interaction)` | `void` | public method. |
| `collect(@Nonnull CollectorTag tag, @Nonnull InteractionContext context, @Nonnull Interaction interaction)` | `boolean` | public method. |
| `outof()` | `void` | public method. |
| `finished()` | `void` | public method. |
