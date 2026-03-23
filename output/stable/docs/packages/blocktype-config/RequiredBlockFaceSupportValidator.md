---
title: "RequiredBlockFaceSupportValidator"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.RequiredBlockFaceSupportValidator"
api_surface: "public"
extends: "java.lang.Object"
implements: ["LegacyValidator<Map<BlockFace, RequiredBlockFaceSupport[]>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "validation"]
---

Validates `RequiredBlockFaceSupport` configurations. Checks for null entries, empty requirements with non-ignored support, and redundant entries that disable both support and propagation.
