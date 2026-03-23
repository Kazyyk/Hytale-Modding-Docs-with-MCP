---
title: "FarmingStageData"
kind: abstract class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.farming.FarmingStageData"
api_surface: "public"
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "farming"]
---

Base class for farming stage definitions. Each stage has a `duration` range, optional sound event, and lifecycle methods: `apply()` (triggers when entering the stage), `remove()` (cleanup when leaving), and `shouldStop()` (conditional early termination). Uses a `CodecMapCodec` for polymorphic deserialization by `Type` key.
