---
title: "RepairItemInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages.itemrepair"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.itemrepair.RepairItemInteraction"
api_surface: false
extends: "ChoiceInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "pages"
  - "itemrepair"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages.itemrepair`

```java
public class RepairItemInteraction extends ChoiceInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `ItemContext` | `itemContext` |
| `protected final` | `double` | `repairPenalty` |
| `protected final` | `ItemContext` | `heldItemContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)` |
