---
title: "BlockType"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockType"
api_surface: "public"
extends: "java.lang.Object"
implements: ["JsonAssetWithMap<String, BlockTypeAssetMap<String, BlockType>>", "NetworkSerializable<com.hypixel.hytale.protocol.BlockType>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "asset", "config"]
---

The central block type definition asset. Contains all configurable properties for a block in the game: material, textures, collision boxes, movement settings, gathering behavior, placement rules, support requirements, farming data, bench configuration, rotation variants, states, and more. Defined within Item assets, not standalone. This is the largest and most referenced type in the block system.
