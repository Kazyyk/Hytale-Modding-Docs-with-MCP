---
title: "com.hypixel.hytale.server.core.universe.world.meta"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.meta"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "state"
  - "world"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta`

Block state metadata system for the world. Provides the abstract `BlockState` component that attaches stateful behavior to individual blocks (containers, tickable logic, network-sendable data), along with the module, registry, and registration infrastructure for managing block state types within the ECS.

All types in this package are deprecated for removal in favor of a newer block entity system.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockState](BlockState.md) | abstract class | Abstract ECS component representing stateful block data at a specific position. |
| [BlockStateModule](BlockStateModule.md) | class | Server plugin managing block state registration, lifecycle systems, and ECS integration. |
| [BlockStateRegistration](BlockStateRegistration.md) | class | Registration handle for a block state class with lifecycle callbacks. |
| [BlockStateRegistry](BlockStateRegistry.md) | class | Plugin-facing registry facade for registering block state types. |
