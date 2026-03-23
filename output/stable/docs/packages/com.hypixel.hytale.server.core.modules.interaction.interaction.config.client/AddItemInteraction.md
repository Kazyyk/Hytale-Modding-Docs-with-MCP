---
title: "AddItemInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.AddItemInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public class AddItemInteraction extends SimpleBlockInteraction
```

Adds a specified item and quantity to the interacting entity's inventory. Configured via `ItemId` and `Quantity` codec fields. The item is added to the entity's combined hotbar-first inventory.

## Codec

`AddItemInteraction.CODEC` -- `BuilderCodec<AddItemInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`
