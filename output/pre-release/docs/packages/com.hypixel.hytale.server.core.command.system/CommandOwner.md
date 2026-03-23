---
title: "CommandOwner"
kind: "interface"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandOwner"
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
public interface CommandOwner
```

Marker interface for the entity that owns a command (either `PluginBase` or `CommandManager`). Provides `getName()`.
