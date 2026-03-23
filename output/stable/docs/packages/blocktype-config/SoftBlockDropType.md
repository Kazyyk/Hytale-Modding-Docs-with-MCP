---
title: "SoftBlockDropType"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.SoftBlockDropType"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.SoftBlock>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "drops"]
---

Defines drops for soft blocks (blocks that break on contact). Contains optional `itemId`, `dropListId`, and `isWeaponBreakable` flag (default true). The `withoutDrops()` method preserves the weapon-breakable setting.
