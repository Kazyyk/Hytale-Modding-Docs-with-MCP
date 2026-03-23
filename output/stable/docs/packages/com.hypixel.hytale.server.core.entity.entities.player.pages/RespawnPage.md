---
title: "RespawnPage"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.RespawnPage"
api_surface: false
extends: "InteractiveCustomUIPage<RespawnPage.RespawnPageEventData>"
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
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages`

```java
public class RespawnPage extends InteractiveCustomUIPage<RespawnPage.RespawnPageEventData>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `UI_RESPAWN_PAGE` |
| `private static final` | `String` | `ELEMENT_BUTTON_RESPAWN` |
| `private static final` | `String` | `ELEMENT_LABEL_DEATH_REASON_TEXT_SPANS` |
| `private final` | `Message` | `deathReason` |
| `private final` | `boolean` | `displayDataOnDeathScreen` |
| `private final` | `DeathItemLoss` | `deathItemLoss` |
| `private final` | `ItemStack[]` | `itemsLostOnDeath` |
| `private` | `String` | `action` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable private static` | `ItemStack[]` | `combineSimilarItemStacks(@Nullable ItemStack[] itemsLostOnDeath)` |
| `@Override public` | `void` | `build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPage.RespawnPageEventData data)` |
| `@Override public` | `void` | `onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)` |

## Inner Types

- `RespawnPage.RespawnPageEventData`
