---
title: "com.hypixel.hytale.server.core.asset.type.blocktick"
package: "com.hypixel.hytale.server.core.asset.type.blocktick"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "blocktick"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktick`

Types in the `blocktick` subsystem.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [BlockTickManager](BlockTickManager.md) | class | No | Utility type in the `blocktick` subsystem |
| [BlockTickStrategy](BlockTickStrategy.md) | enum | Yes | Enumeration with values: `CONTINUE`, `IGNORED`, `SLEEP`, `WAIT_FOR_ADJACENT_CHUNK_LOAD` |
| [IBlockTickProvider](IBlockTickProvider.md) | interface | No | Functional interface defining `getTickProcedure` that returns `TickProcedure` |
