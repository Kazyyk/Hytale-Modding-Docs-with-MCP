---
title: "CommandContext"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandContext"
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
public class CommandContext
```

Holds the parsed argument values, input string, and sender reference for a single command invocation. Provides typed accessors `get(Argument)`, `provided(Argument)`, sender casting via `senderAs(Class)`, and convenience methods like `isPlayer()` and `senderAsPlayerRef()`.
