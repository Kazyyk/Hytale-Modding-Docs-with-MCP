---
title: "GrowthModifierAsset"
kind: abstract class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.GrowthModifierAsset"
api_surface: "public"
extends: "java.lang.Object"
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, GrowthModifierAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "farming", "asset"]
---

Asset-registered growth modifier for farming. Each modifier has a `modifier` multiplier (double) and a `getCurrentGrowthMultiplier()` method that subclasses can override for context-sensitive growth rates (e.g., based on adjacent blocks or light level).
