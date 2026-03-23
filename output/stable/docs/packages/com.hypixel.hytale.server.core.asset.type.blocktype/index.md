---
title: "com.hypixel.hytale.server.core.asset.type.blocktype"
package: "com.hypixel.hytale.server.core.asset.type.blocktype"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "blocktype"
  - "networking"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype`

Root-level types in the block type asset package. Contains packet generators for synchronizing block type and block group data to clients. None of the types in this package root are part of the public API surface (surface types are in the `config` subpackage).

## Packet Generators

| Type | Kind | Description |
|---|---|---|
| [BlockGroupPacketGenerator](BlockGroupPacketGenerator.md) | class | Generates `UpdateBlockGroups` packets for block group asset sync. |
| [BlockTypePacketGenerator](BlockTypePacketGenerator.md) | class | Generates `UpdateBlockTypes` packets for block type asset sync. |
