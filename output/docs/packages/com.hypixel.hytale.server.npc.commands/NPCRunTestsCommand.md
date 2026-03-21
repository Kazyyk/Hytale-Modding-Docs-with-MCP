---
title: "NPCRunTestsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCRunTestsCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCRunTestsCommand extends AbstractPlayerCommand
```

Implements `/npc runtests`. Runs a sequential NPC behavior test suite. Spawns one NPC role at a time at the player's position and waits for the tester to mark each as pass, fail, or abort. Tracks test results per role and reports a summary when all roles have been tested or the test is aborted.

Supports specifying roles via a comma-separated list or using a preset set from `NPCPlugin.getPresetCoverageTestNPCs()`. Role names can include a flock size suffix (e.g., `"Zombie#5"` to spawn a flock of 5).

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `roles` | `String` | conditional | Comma-separated list of role names (with optional `#flockSize` suffix) |
| `--preset` | flag | no | Use the preset coverage test NPC list |
| `--pass` | flag | no | Mark current NPC as passed, advance to next |
| `--fail` | flag | no | Mark current NPC as failed, advance to next |
| `--abort` | flag | no | Abort the test suite and report results |

## Constructor

```java
public NPCRunTestsCommand()
```

Registers as sub-command `"runtests"` with translation key `"server.commands.npc.runtests.desc"`.

## Inner Classes

| Class | Description |
|---|---|
| [NPCRunTestsCommand.NPCTestData](NPCRunTestsCommand.NPCTestData.md) | ECS component storing test session state |

## Related Types

- [NPCRunTestsCommand.NPCTestData](NPCRunTestsCommand.NPCTestData.md) -- test session state component
- [NPCCommand](NPCCommand.md) -- parent command collection
