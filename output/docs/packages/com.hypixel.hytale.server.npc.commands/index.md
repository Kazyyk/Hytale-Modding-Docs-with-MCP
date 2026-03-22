---
title: "com.hypixel.hytale.server.npc.commands"
kind: "package"
package: "com.hypixel.hytale.server.npc.commands"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

This package contains the 23 command classes (49 types including inner classes) that implement the `/npc` command tree. These commands are registered by `NPCPlugin.setup()` via [NPCCommand](NPCCommand.md) and provide server operators with tools for spawning, inspecting, debugging, and controlling NPC entities at runtime.

All types in this package are internal (`api_surface: false`). They are not part of the public plugin API.

## Command Tree

```
/npc
  all          -- Spawn all NPC roles in a grid
  appearance   -- Change NPC model
  attack       -- Override attack interactions
    (set)      -- Set attack overrides
    clear      -- Clear attack overrides
  benchmark    -- Start performance benchmarks
  blackboard   -- Inspect NPC perception data
    chunks     -- List blackboard chunk sections
    chunk      -- Inspect a specific chunk
    drop       -- Clear all blackboard data
    views      -- List block type views
    view       -- Inspect a specific block type view
    blockevents    -- Show block event subscriptions
    entityevents   -- Show entity event subscriptions
    resourceviews  -- List resource views
    resourceview   -- Inspect a specific resource view
    reserve    -- Add/remove player-NPC reservation
    reservation -- Check reservation status
  clean        -- Remove all NPCs from world
  debug        -- Manage debug flags
    show       -- Show current flags
    set        -- Replace flags
    toggle     -- Toggle individual flags
    defaults   -- Apply default preset
    clear      -- Remove all flags
    presets    -- List available presets
  dump         -- Dump NPC state to log
  freeze       -- Pause NPC behavior
  give         -- Give item to NPC
    nothing    -- Clear held item
  message      -- Send beacon message to NPC
  path         -- Assign transient paths
    (set)      -- Set path from rotation/distance pairs
    polygon    -- Set regular polygon path
  role         -- Change NPC role
    (get)      -- Display current role
  runtests     -- Run NPC behavior test suite
  sensorstats  -- Display sensor range statistics
  spawn        -- Spawn NPCs with options
    (page)     -- Open spawn UI page
  step         -- Step NPC behavior one tick
  test         -- Diagnostic tests
    probe      -- Test position validity
  thaw         -- Unfreeze NPCs
```

## Base Classes

| Type | Kind | Description |
|---|---|---|
| [NPCWorldCommandBase](NPCWorldCommandBase.md) | abstract class | Base for single-NPC world commands with automatic target resolution |
| [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) | abstract class | Base for multi-NPC commands with spatial selection (cone, sphere, ray) |
| [NPCCommandUtils](NPCCommandUtils.md) | class | Static utility for resolving target NPC from command context |

## Top-Level Commands

| Type | Kind | Sub-command | Description |
|---|---|---|---|
| [NPCCommand](NPCCommand.md) | class | `/npc` | Root command collection |
| [NPCAllCommand](NPCAllCommand.md) | class | `all` | Spawn all roles in a grid |
| [NPCAppearanceCommand](NPCAppearanceCommand.md) | class | `appearance` | Change NPC model |
| [NPCAttackCommand](NPCAttackCommand.md) | class | `attack` | Override attack interactions |
| [NPCBenchmarkCommand](NPCBenchmarkCommand.md) | class | `benchmark` | Performance benchmarking |
| [NPCBlackboardCommand](NPCBlackboardCommand.md) | class | `blackboard` | Inspect perception data |
| [NPCCleanCommand](NPCCleanCommand.md) | class | `clean` | Remove all NPCs |
| [NPCDebugCommand](NPCDebugCommand.md) | class | `debug` | Manage debug flags |
| [NPCDumpCommand](NPCDumpCommand.md) | class | `dump` | Dump NPC state |
| [NPCFreezeCommand](NPCFreezeCommand.md) | class | `freeze` | Pause NPC behavior |
| [NPCGiveCommand](NPCGiveCommand.md) | class | `give` | Give item to NPC |
| [NPCMessageCommand](NPCMessageCommand.md) | class | `message` | Send beacon messages |
| [NPCPathCommand](NPCPathCommand.md) | class | `path` | Assign transient paths |
| [NPCRoleCommand](NPCRoleCommand.md) | class | `role` | Change NPC role |
| [NPCRunTestsCommand](NPCRunTestsCommand.md) | class | `runtests` | Run behavior test suite |
| [NPCSensorStatsCommand](NPCSensorStatsCommand.md) | class | `sensorstats` | Sensor range statistics |
| [NPCSpawnCommand](NPCSpawnCommand.md) | class | `spawn` | Spawn NPCs |
| [NPCStepCommand](NPCStepCommand.md) | class | `step` | Step behavior one tick |
| [NPCTestCommand](NPCTestCommand.md) | class | `test` | Diagnostic tests |
| [NPCThawCommand](NPCThawCommand.md) | class | `thaw` | Unfreeze NPCs |

## Inner Classes

| Type | Kind | Parent | Description |
|---|---|---|---|
| [NPCAttackCommand.SetAttackCommand](NPCAttackCommand.SetAttackCommand.md) | class | NPCAttackCommand | Sets attack overrides |
| [NPCAttackCommand.ClearAttackCommand](NPCAttackCommand.ClearAttackCommand.md) | class | NPCAttackCommand | Clears attack overrides |
| [NPCBlackboardCommand.ChunksCommand](NPCBlackboardCommand.ChunksCommand.md) | class | NPCBlackboardCommand | Lists chunk sections |
| [NPCBlackboardCommand.ChunkCommand](NPCBlackboardCommand.ChunkCommand.md) | class | NPCBlackboardCommand | Inspects a chunk |
| [NPCBlackboardCommand.DropCommand](NPCBlackboardCommand.DropCommand.md) | class | NPCBlackboardCommand | Clears blackboard |
| [NPCBlackboardCommand.ViewsCommand](NPCBlackboardCommand.ViewsCommand.md) | class | NPCBlackboardCommand | Lists block type views |
| [NPCBlackboardCommand.ViewCommand](NPCBlackboardCommand.ViewCommand.md) | class | NPCBlackboardCommand | Inspects a view |
| [NPCBlackboardCommand.BlockEventsCommand](NPCBlackboardCommand.BlockEventsCommand.md) | class | NPCBlackboardCommand | Block event subscriptions |
| [NPCBlackboardCommand.EntityEventsCommand](NPCBlackboardCommand.EntityEventsCommand.md) | class | NPCBlackboardCommand | Entity event subscriptions |
| [NPCBlackboardCommand.ResourceViewsCommand](NPCBlackboardCommand.ResourceViewsCommand.md) | class | NPCBlackboardCommand | Lists resource views |
| [NPCBlackboardCommand.ResourceViewCommand](NPCBlackboardCommand.ResourceViewCommand.md) | class | NPCBlackboardCommand | Inspects a resource view |
| [NPCBlackboardCommand.ReserveCommand](NPCBlackboardCommand.ReserveCommand.md) | class | NPCBlackboardCommand | Manages reservations |
| [NPCBlackboardCommand.ReservationCommand](NPCBlackboardCommand.ReservationCommand.md) | class | NPCBlackboardCommand | Checks reservation status |
| [NPCDebugCommand.ShowCommand](NPCDebugCommand.ShowCommand.md) | class | NPCDebugCommand | Shows debug flags |
| [NPCDebugCommand.SetCommand](NPCDebugCommand.SetCommand.md) | class | NPCDebugCommand | Sets debug flags |
| [NPCDebugCommand.ToggleCommand](NPCDebugCommand.ToggleCommand.md) | class | NPCDebugCommand | Toggles debug flags |
| [NPCDebugCommand.DefaultsCommand](NPCDebugCommand.DefaultsCommand.md) | class | NPCDebugCommand | Applies default preset |
| [NPCDebugCommand.ClearCommand](NPCDebugCommand.ClearCommand.md) | class | NPCDebugCommand | Clears debug flags |
| [NPCDebugCommand.PresetsCommand](NPCDebugCommand.PresetsCommand.md) | class | NPCDebugCommand | Lists presets |
| [NPCGiveCommand.GiveNothingCommand](NPCGiveCommand.GiveNothingCommand.md) | class | NPCGiveCommand | Clears held item |
| [NPCPathCommand.SetPathCommand](NPCPathCommand.SetPathCommand.md) | class | NPCPathCommand | Sets freeform path |
| [NPCPathCommand.PolygonPathCommand](NPCPathCommand.PolygonPathCommand.md) | class | NPCPathCommand | Sets polygon path |
| [NPCRoleCommand.GetRoleCommand](NPCRoleCommand.GetRoleCommand.md) | class | NPCRoleCommand | Gets current role |
| [NPCRunTestsCommand.NPCTestData](NPCRunTestsCommand.NPCTestData.md) | class | NPCRunTestsCommand | Test session ECS component |
| [NPCSpawnCommand.SpawnPageCommand](NPCSpawnCommand.SpawnPageCommand.md) | class | NPCSpawnCommand | Spawn UI page |
| [NPCTestCommand.ProbeTestCommand](NPCTestCommand.ProbeTestCommand.md) | class | NPCTestCommand | Position probe test |
