---
title: "InteractiveCustomUIPage"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.InteractiveCustomUIPage"
api_surface: true
extends: "CustomUIPage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "pages"
  - "abstract class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages`

```java
public abstract class InteractiveCustomUIPage<T> extends CustomUIPage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `BuilderCodec<T>` | `eventDataCodec` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull T data)` |
| `protected` | `void` | `sendUpdate(@Nullable UICommandBuilder commandBuilder, @Nullable UIEventBuilder eventBuilder, boolean clear)` |
| `@Override public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, String rawData)` |
| `@Override protected` | `void` | `sendUpdate(@Nullable UICommandBuilder commandBuilder, boolean clear)` |
