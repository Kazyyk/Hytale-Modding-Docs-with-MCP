---
title: "DumpCommandsCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.utility.metacommands"
fqcn: "com.hypixel.hytale.server.core.command.commands.utility.metacommands.DumpCommandsCommand"
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
  - "metacommands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.utility.metacommands`

```java
public class DumpCommandsCommand extends CommandBase
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `executeSync(CommandContext context)` |
| `private` | `List<DumpCommandsCommand.CommandDef>` | `gatherCommandDefs()` |
| `private` | `void` | `extractCommand(AbstractCommand command, List<DumpCommandsCommand.CommandDef> defs)` |
| `private` | `String` | `formatNullable(T something, Function<T,String> func)` |
| `private` | `String` | `formatPermission(String permission)` |
