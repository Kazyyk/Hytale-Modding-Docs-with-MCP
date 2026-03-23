---
title: "AuthPersistenceCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.server.auth"
fqcn: "com.hypixel.hytale.server.core.command.commands.server.auth.AuthPersistenceCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "commands"
  - "server"
  - "auth"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.commands.server.auth`

```java
public class AuthPersistenceCommand extends CommandBase
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("persistence", "server.commands.auth.persistence.desc")` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
| `` | `` | `SetPersistenceVariant()` |
| `` | `` | `super("server.commands.auth.persistence.variant.desc")` |
