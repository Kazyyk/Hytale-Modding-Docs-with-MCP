---
title: "StateData"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.StateData"
api_surface: "public"
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "state"]
---

Defines block state mappings. Maps state names to block type keys via `stateToBlock` and maintains the reverse `blockToState` mapping. Used for block state transitions (e.g., on/off, open/closed). The `Definitions` field uses `ContainedAssetCodec` to inline block type definitions within the state data.
