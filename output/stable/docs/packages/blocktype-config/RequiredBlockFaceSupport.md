---
title: "RequiredBlockFaceSupport"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.RequiredBlockFaceSupport"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.RequiredBlockFaceSupport>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "support"]
---

Defines what support a block requires from a neighboring face. Supports matching by face type, self face type, block set, block type, fluid, tag, and self-matching. The `Match` enum (`IGNORED`, `REQUIRED`, `DISALLOWED`) controls each criterion. Supports rotation and filler position filtering.
