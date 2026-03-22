---
title: "Rotation"
kind: enum
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.Rotation"
api_surface: "public"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.Rotation>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "enum", "rotation"]
---

Represents four 90-degree rotation values: `None` (0), `Ninety` (90), `OneEighty` (180), `TwoSeventy` (270). Provides rotation operations on `Vector3i`, `Vector3f`, and `Vector3d` around X, Y, and Z axes. Includes static utility methods for combined yaw/pitch/roll rotations and degree-based construction.
