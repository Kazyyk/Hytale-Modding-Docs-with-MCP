---
title: "CustomTemplateConnectedBlockPattern"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.CustomTemplateConnectedBlockPattern"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "universe"
  - "world"
  - "connectedblocks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks`

```java
public abstract class CustomTemplateConnectedBlockPattern
```

Connected block pattern that references a CustomConnectedBlockTemplateAsset for rule evaluation.

## Constants

| Type | Name |
|---|---|
| `CodecMapCodec<CustomTemplateConnectedBlockPattern>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getConnectedBlockTypeKey(String var1, @Nonnull World var2, @Nonnull Vector3i var3, @Nonnull CustomTemplateConnectedBlockRuleSet var4, @Nonnull BlockType var5, int var6, @Nonnull Vector3i var7, boolean var8)` |
