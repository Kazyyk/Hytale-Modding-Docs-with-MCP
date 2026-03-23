---
title: "com.hypixel.hytale.server.core.modules"
kind: "package"
package: "com.hypixel.hytale.server.core.modules"
fqcn: "com.hypixel.hytale.server.core.modules"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "module"
  - "core"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.modules`

Core server module providing legacy chunk component registration. Registers fundamental chunk store component types (WorldChunk, BlockChunk, EntityChunk, BlockComponentChunk, EnvironmentChunk, ChunkColumn, ChunkSection, BlockSection, FluidSection, BlockPositionProvider) and their associated loading, migration, and replication systems.

## Types

| Type | Kind | Description |
|---|---|---|
| [LegacyModule](LegacyModule.md) | class | Core server plugin that registers all fundamental chunk store component types and their ECS systems. |
