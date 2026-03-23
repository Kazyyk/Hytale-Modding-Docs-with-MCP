---
title: "BlockMigration"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.BlockMigration"
api_surface: "public"
extends: "java.lang.Object"
implements: ["JsonAssetWithMap<Integer, DefaultAssetMap<Integer, BlockMigration>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "migration"]
---

Handles block type ID migration between versions. Maps old block type keys to new ones via `directMigrations` and `nameMigrations` maps. Used during world loading to update blocks to their current identifiers.
