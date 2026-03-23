---
title: "VariantRotation"
kind: enum
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.VariantRotation"
api_surface: "public"
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.VariantRotation>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T05:14:49Z"
tags: ["blocktype", "enum", "rotation"]
---

Defines rotation variant modes for blocks. Values: `None`, `Wall`, `UpDown`, `Pipe`, `DoublePipe`, `NESW`, `UpDownNESW`, `Debug`, `All`. Each value specifies the valid rotation tuples, a verification function, and X/Z rotation functions. Controls which orientations a block can have when placed.
