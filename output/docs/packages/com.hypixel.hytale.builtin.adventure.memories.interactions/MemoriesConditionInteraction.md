---
title: "MemoriesConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.interactions.MemoriesConditionInteraction"
api_surface: false
extends: "Interaction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "memories"
  - "interactions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.interactions`

```java
public class MemoriesConditionInteraction extends Interaction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `StringTag` | `TAG_FAILED` |
| `@Nonnull private` | `Int2ObjectMap<String>` | `next` |
| `private transient` | `int[]` | `sortedKeys` |
| `@Nonnull private final` | `Int2IntOpenHashMap` | `levelToLabel` |
| `@Nullable private` | `String` | `failed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateTick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `@Override public` | `void` | `compile(@Nonnull OperationsBuilder builder)` |
| `@Nonnull @Override protected` | `com.hypixel.hytale.protocol.Interaction` | `generatePacket()` |
| `@Override protected` | `void` | `configurePacket(@Nonnull com.hypixel.hytale.protocol.Interaction packet)` |
| `@Override public` | `boolean` | `walk(@Nonnull Collector collector, @Nonnull InteractionContext context)` |
| `@Override public` | `boolean` | `needsRemoteSync()` |
| `@Nonnull @Override public` | `WaitForDataFrom` | `getWaitForDataFrom()` |

## Inner Types

- `MemoriesConditionInteraction.MemoriesTag`
