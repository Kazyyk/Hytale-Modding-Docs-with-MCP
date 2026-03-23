---
title: "CustomUIPage"
kind: "abstract class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.CustomUIPage"
api_surface: true
extends: ~
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
public abstract class CustomUIPage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `PlayerRef` | `playerRef` |
| `protected` | `CustomPageLifetime` | `lifetime` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setLifetime(@Nonnull CustomPageLifetime lifetime)` |
| `@Nonnull public` | `CustomPageLifetime` | `getLifetime()` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, String rawData)` |
| `public abstract` | `void` | `build(@Nonnull Ref<EntityStore> var1, @Nonnull UICommandBuilder var2, @Nonnull UIEventBuilder var3, @Nonnull Store<EntityStore> var4)` |
| `protected` | `void` | `rebuild()` |
| `protected` | `void` | `sendUpdate()` |
| `protected` | `void` | `sendUpdate(@Nullable UICommandBuilder commandBuilder)` |
| `protected` | `void` | `sendUpdate(@Nullable UICommandBuilder commandBuilder, boolean clear)` |
| `protected` | `void` | `close()` |
| `public` | `void` | `onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
