---
title: "CommandManager"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandManager"
api_surface: true
extends: ~
implements: ["com.hypixel.hytale.server.core.command.system.CommandOwner"]
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class CommandManager
```

Singleton that registers all built-in commands, resolves command names and aliases, tokenizes input, and dispatches execution on the common `ForkJoinPool`. Implements `CommandOwner`.
