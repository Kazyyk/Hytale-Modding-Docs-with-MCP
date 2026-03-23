---
title: "BlockGathering"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockGathering"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.BlockGathering>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "gathering"]
---

Defines how a block is gathered (broken/harvested). Contains sub-configurations for breaking, harvesting, soft block, and physics drop types, plus per-tool overrides via `BlockToolData`. The `useDefaultDropWhenPlaced` flag controls whether player-placed blocks use default drops instead of drop lists.
