---
title: "SleepTestCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.sleep"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.sleep.SleepTestCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "command"
  - "commands"
  - "utility"
  - "sleep"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.sleep`

```java
public class SleepTestCommand extends CommandBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_COMMANDS_SLEEP_TEST_INTERRUPTED` |
| `private final` | `DefaultArg<Integer>` | `sleepArg` |
| `private final` | `DefaultArg<Integer>` | `countArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `executeSync(CommandContext context)` |
