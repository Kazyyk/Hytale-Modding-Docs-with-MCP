---
title: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none`

Server-side interaction implementations that require no client-side configuration data (`WaitForDataFrom.None` or client-synced). Includes control flow interactions (serial, parallel, repeat, replace, select, cancel-chain, chain-flag, run-root), condition interactions (movement state, entity effects, stat values), camera/builder-tool interactions, and active slot management.

## Types

| Type | Kind | Description |
|---|---|---|
| [BuilderToolInteraction](BuilderToolInteraction.md) | class | Runs a builder tool interaction, syncing client state to server state before del... |
| [CameraInteraction](CameraInteraction.md) | class | Adjusts the camera perspective, action type, persistence, and interaction time f... |
| [CancelChainInteraction](CancelChainInteraction.md) | class | Cancels an active chaining state for a specified chain ID by removing it from th... |
| [ChainFlagInteraction](ChainFlagInteraction.md) | class | Sets a named flag on a given chain ID that a `ChainingInteraction` can use to ad... |
| [ChangeActiveSlotInteraction](ChangeActiveSlotInteraction.md) | class | Changes the active hotbar slot for the interaction user. Optionally targets a sp... |
| [ConditionInteraction](ConditionInteraction.md) | class | Succeeds or fails based on movement state conditions: required game mode, jumpin... |
| [EffectConditionInteraction](EffectConditionInteraction.md) | class | Succeeds or fails based on whether specified entity effects are active on a targ... |
| [ParallelInteraction](ParallelInteraction.md) | class | Runs multiple interaction roots in parallel by forking the first and creating ad... |
| [RepeatInteraction](RepeatInteraction.md) | class | Forks into a child interaction chain and optionally repeats it a specified numbe... |
| [ReplaceInteraction](ReplaceInteraction.md) | class | Looks up an interaction variable by name and runs the referenced root interactio... |
| [RunRootInteraction](RunRootInteraction.md) | class | Immediately executes a referenced root interaction by ID, finishing the current ... |
| [SelectInteraction](SelectInteraction.md) | class | Area selection interaction that uses a `Selector` to find entities and blocks ea... |
| [SerialInteraction](SerialInteraction.md) | class | Compiles a list of child interactions to run sequentially. The `tick0` method is... |
| [StatsConditionBaseInteraction](StatsConditionBaseInteraction.md) | class | Abstract base for stat-condition interactions. Defines codec fields for stat cos... |
| [StatsConditionInteraction](StatsConditionInteraction.md) | class | Concrete stat-condition interaction that checks entity stat values directly agai... |
| [StatsConditionWithModifierInteraction](StatsConditionWithModifierInteraction.md) | class | Stat-condition interaction that applies armor interaction modifiers (additive an... |
