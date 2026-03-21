---
title: "RotationTuple"
kind: record
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.RotationTuple"
api_surface: "public"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "rotation"]
---

Record combining `index`, `yaw`, `pitch`, and `roll` `Rotation` values into a single rotation state. Pre-computes all 64 possible combinations in a static `VALUES` array. Provides factory methods `of()`, index calculation, and rotation application to `Vector3d`.
