---
title: "ChoiceBasePage"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages.choices"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.choices.ChoiceBasePage"
api_surface: false
extends: "InteractiveCustomUIPage<ChoiceBasePage.ChoicePageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "entity"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages.choices`

```java
public abstract class ChoiceBasePage extends InteractiveCustomUIPage<ChoiceBasePage.ChoicePageEventData>
```

Class in the choices subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `elements` | `ChoiceElement[]` | final ChoiceElement[] field. |
| `pageLayout` | `String` | final String field. |

## Constructors

| Constructor | Description |
|---|---|
| `ChoiceBasePage(@Nonnull PlayerRef playerRef, ChoiceElement[] elements, String pageLayout)` | Creates a new ChoiceBasePage instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getElements()` | `ChoiceElement[]` | protected method. |
| `getPageLayout()` | `String` | protected method. |
| `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull ChoiceBasePage.ChoicePageEventData data)` | `void` | public method. |
