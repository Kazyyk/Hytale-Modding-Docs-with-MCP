---
title: "PageManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.PageManager"
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
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages`

```java
public class PageManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `WindowManager` | `windowManager` |
| `private` | `PlayerRef` | `playerRef` |
| `private` | `CustomUIPage` | `customPage` |
| `private final` | `AtomicInteger` | `customPageRequiredAcknowledgments` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `init(@Nonnull PlayerRef playerRef, @Nonnull WindowManager windowManager)` |
| `public` | `void` | `clearCustomPageAcknowledgements()` |
| `@Nullable public` | `CustomUIPage` | `getCustomPage()` |
| `public` | `void` | `setPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page)` |
| `public` | `void` | `setPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page, boolean canCloseThroughInteraction)` |
| `public` | `void` | `openCustomPage(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomUIPage page)` |
| `public` | `boolean` | `setPageWithWindows( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Page page, boolean canCloseThroughInteraction, @Nonnull Window... windows )` |
| `public` | `boolean` | `openCustomPageWithWindows( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomUIPage page, @Nonnull Window... windows )` |
| `public` | `void` | `updateCustomPage(@Nonnull CustomPage page)` |
| `public` | `void` | `handleEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull CustomPageEvent event)` |
