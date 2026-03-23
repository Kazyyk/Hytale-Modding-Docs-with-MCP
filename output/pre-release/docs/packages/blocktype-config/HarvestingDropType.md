---
title: "HarvestingDropType"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.HarvestingDropType"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.Harvesting>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "drops"]
---

Defines drops when a block is harvested (e.g., crops). Contains optional `itemId` and `dropListId`. The `withoutDrops()` method returns null, removing harvest drops entirely.
