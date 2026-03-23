---
title: "BlockConditionInteraction.BlockMatcher"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.BlockConditionInteraction.BlockMatcher"
api_surface: false
extends: ~
implements: 
  - "NetworkSerializable<BlockMatcher>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

```java
public static class BlockConditionInteraction.BlockMatcher implements NetworkSerializable<BlockMatcher>
```

Matches a block against criteria including block identity (via `BlockIdMatcher`), face direction, and static face flag. When `staticFace` is false, the face matching accounts for the block's rotation.
