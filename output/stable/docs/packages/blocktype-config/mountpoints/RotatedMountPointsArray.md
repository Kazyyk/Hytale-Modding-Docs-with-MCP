---
title: "RotatedMountPointsArray"
kind: class
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.mountpoints.RotatedMountPointsArray"
api_surface: "public"
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "mount"]
---

Lazily computed array of mount points for all rotation variants. Stores the raw `BlockMountPoint[]` and caches rotated versions on first access per rotation index. Uses `RotationTuple.VALUES.length` for the cache size.
