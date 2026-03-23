---
title: "PlaySoundPage"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages.audio"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.audio.PlaySoundPage"
api_surface: false
extends: "InteractiveCustomUIPage<PlaySoundPage.PlaySoundPageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "pages"
  - "audio"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages.audio`

```java
public class PlaySoundPage extends InteractiveCustomUIPage<PlaySoundPage.PlaySoundPageEventData>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `COMMON_TEXT_BUTTON_DOCUMENT` |
| `private static final` | `Value<String>` | `BUTTON_LABEL_STYLE` |
| `private static final` | `Value<String>` | `BUTTON_LABEL_STYLE_SELECTED` |
| `@Nonnull private` | `String` | `searchQuery` |
| `private` | `List<String>` | `soundEvents` |
| `@Nullable private` | `String` | `selectedSoundEvent` |
| `private` | `float` | `volumeDecibels` |
| `private` | `float` | `pitchSemitones` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `PlaySoundPage(@Nonnull PlayerRef playerRef)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PlaySoundPage.PlaySoundPageEventData data)` |
| `private` | `void` | `buildSoundEventList(@Nonnull Ref<EntityStore> ref,
        @Nonnull UICommandBuilder commandBuilder,
        @Nonnull UIEventBuilder eventBuilder,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `private` | `void` | `selectSoundEvent(@Nonnull Ref<EntityStore> ref,
        @Nonnull String soundEvent,
        @Nonnull UICommandBuilder commandBuilder,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

## Inner Types

- `PlaySoundPage.PlaySoundPageEventData`
