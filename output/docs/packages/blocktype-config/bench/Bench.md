---
title: "Bench"
kind: abstract class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.Bench"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.Bench>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "bench"]
---

Abstract base for all bench types (crafting stations). Contains bench ID, descriptive label, tier levels, and sound event IDs for open/close/complete/fail/upgrade actions. Uses `ObjectCodecMapCodec` with `BenchType` discriminator for polymorphic deserialization. Inner class `BenchSlot` defines an icon for a bench slot.
