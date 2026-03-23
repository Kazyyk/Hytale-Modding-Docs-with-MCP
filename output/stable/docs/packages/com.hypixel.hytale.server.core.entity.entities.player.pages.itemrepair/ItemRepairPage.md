---
title: "ItemRepairPage"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages.itemrepair"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.itemrepair.ItemRepairPage"
api_surface: false
extends: "ChoiceBasePage"
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
public class ItemRepairPage extends ChoiceBasePage
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)` |
| `@Nonnull protected static` | `ChoiceElement[]` | `getItemElements(ItemContainer itemContainer, double repairPenalty, ItemContext heldItemContext)` |
