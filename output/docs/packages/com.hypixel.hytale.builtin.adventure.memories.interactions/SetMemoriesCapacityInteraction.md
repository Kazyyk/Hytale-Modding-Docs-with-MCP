---
title: "SetMemoriesCapacityInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.interactions.SetMemoriesCapacityInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
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
public class SetMemoriesCapacityInteraction extends SimpleInstantInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `String` | `NOTIFICATION_ICON_MEMORIES` |
| `@Nonnull private static final` | `Message` | `MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_NOTIFICATION` |
| `@Nonnull private static final` | `Message` | `MESSAGE_SERVER_MEMORIES_GENERAL_FEATURE_UNLOCKED_MESSAGE` |
| `@Nonnull public static final` | `BuilderCodec<SetMemoriesCapacityInteraction>` | `CODEC` |
| `private` | `int` | `capacity` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` |
| `@Nonnull @Override public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `@Override public` | `String` | `toString()` |
