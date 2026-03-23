---
title: "BlockConditionInteraction.BlockIdMatcher"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.BlockConditionInteraction.BlockIdMatcher"
api_surface: false
extends: ~
implements: 
  - "NetworkSerializable<BlockIdMatcher>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public static class BlockConditionInteraction.BlockIdMatcher implements NetworkSerializable<BlockIdMatcher>
```

Matches a block by ID, state, and/or tag. The `tag` field is resolved to a tag index via `AssetRegistry.getOrCreateTagIndex()` during decoding.
