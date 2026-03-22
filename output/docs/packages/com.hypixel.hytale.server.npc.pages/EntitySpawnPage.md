---
title: "EntitySpawnPage"
kind: "class"
package: "com.hypixel.hytale.server.npc.pages"
fqcn: "com.hypixel.hytale.server.npc.pages.EntitySpawnPage"
api_surface: false
extends: "InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "pages"
---

**Package:** `com.hypixel.hytale.server.npc.pages`

```java
public class EntitySpawnPage extends InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>
```

Interactive custom UI page for spawning NPCs, items, and models with preview, rotation offset, scale control, and tab-based navigation.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<EntitySpawnPage.EntitySpawnPageEventData>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull EntitySpawnPage.EntitySpawnPageEventData data)` |
| `public` | `void` | `onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |
