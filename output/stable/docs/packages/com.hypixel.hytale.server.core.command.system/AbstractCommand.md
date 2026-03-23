---
title: "AbstractCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.AbstractCommand"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public abstract class AbstractCommand
```

Base class for the command system. Manages command name, aliases, description, required/optional/flag arguments, subcommands, usage variants, permission generation, argument parsing, and execution dispatch. Subclasses implement `execute(CommandContext)`.
