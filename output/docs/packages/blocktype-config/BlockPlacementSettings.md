---
title: "BlockPlacementSettings"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockPlacementSettings"
api_surface: "public"
extends: "java.lang.Object"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.BlockPlacementSettings>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "placement"]
---

Controls block placement behavior. Includes rotation key permission, empty-block placement, rotation mode, block preview visibility, and surface-specific block type overrides (wall/floor/ceiling). Inner enums `RotationMode` (`FACING_PLAYER`, `BLOCK_NORMAL`, `STAIR_FACING_PLAYER`, `DEFAULT`) and `BlockPreviewVisibility` (`ALWAYS_VISIBLE`, `ALWAYS_HIDDEN`, `DEFAULT`).
