---
title: "FarmingData"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.FarmingData"
api_surface: "public"
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "farming"]
---

Configuration for farmable blocks. Contains a map of stage sets (named arrays of `FarmingStageData`), a starting stage set name, an optional stage set after harvest, growth modifier asset references, and an optional `SoilConfig` for soil transformation. Inner class `SoilConfig` defines the target block type and lifetime range for soil conversion.
