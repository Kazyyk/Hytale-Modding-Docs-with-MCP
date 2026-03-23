---
title: "NPCCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCCommand extends AbstractCommandCollection
```

Root command collection for the `/npc` command tree. Registered by `NPCPlugin.setup()`. All NPC sub-commands are added in the constructor: `all`, `appearance`, `attack`, `benchmark`, `blackboard`, `clean`, `debug`, `dump`, `flock`, `freeze`, `give`, `path`, `role`, `runtests`, `sensorstats`, `spawn`, `step`, `test`, `thaw`, and `message`.

## Fields

```java
public static final SingleArgumentType<BuilderInfo> NPC_ROLE
```

Custom argument type for parsing NPC role names. Resolves the input string to a `BuilderInfo` via `NPCPlugin.getIndex()` and `NPCPlugin.getRoleBuilderInfo()`. Provides tab-completion by listing all available role template names from `NPCPlugin.getRoleTemplateNames()`. On failure, suggests similar names using `StringUtil.sortByFuzzyDistance()`.

## Constructor

```java
public NPCCommand()
```

Creates the root `/npc` command with the translation key `"server.commands.npc"` and registers all sub-commands.

## Sub-commands

| Sub-command | Class |
|---|---|
| `all` | [NPCAllCommand](NPCAllCommand.md) |
| `appearance` | [NPCAppearanceCommand](NPCAppearanceCommand.md) |
| `attack` | [NPCAttackCommand](NPCAttackCommand.md) |
| `benchmark` | [NPCBenchmarkCommand](NPCBenchmarkCommand.md) |
| `blackboard` | [NPCBlackboardCommand](NPCBlackboardCommand.md) |
| `clean` | [NPCCleanCommand](NPCCleanCommand.md) |
| `debug` | [NPCDebugCommand](NPCDebugCommand.md) |
| `dump` | [NPCDumpCommand](NPCDumpCommand.md) |
| `flock` | `NPCFlockCommand` |
| `freeze` | [NPCFreezeCommand](NPCFreezeCommand.md) |
| `give` | [NPCGiveCommand](NPCGiveCommand.md) |
| `path` | [NPCPathCommand](NPCPathCommand.md) |
| `role` | [NPCRoleCommand](NPCRoleCommand.md) |
| `runtests` | [NPCRunTestsCommand](NPCRunTestsCommand.md) |
| `sensorstats` | [NPCSensorStatsCommand](NPCSensorStatsCommand.md) |
| `spawn` | [NPCSpawnCommand](NPCSpawnCommand.md) |
| `step` | [NPCStepCommand](NPCStepCommand.md) |
| `test` | [NPCTestCommand](NPCTestCommand.md) |
| `thaw` | [NPCThawCommand](NPCThawCommand.md) |
| `message` | [NPCMessageCommand](NPCMessageCommand.md) |

## Related Types

- [NPCCommandUtils](NPCCommandUtils.md) -- shared NPC target resolution utility
- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class for world-scoped NPC commands
- [NPCMultiSelectCommandBase](NPCMultiSelectCommandBase.md) -- base class for multi-entity NPC commands
