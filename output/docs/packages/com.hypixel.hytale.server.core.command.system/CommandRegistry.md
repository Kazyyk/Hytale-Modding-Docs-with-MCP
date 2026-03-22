---
title: "CommandRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandRegistry"
api_surface: true
extends: "com.hypixel.hytale.registry.Registry"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class CommandRegistry
```

Plugin-scoped command registry that delegates to `CommandManager.register()` and tracks registrations with enable/disable lifecycle.
