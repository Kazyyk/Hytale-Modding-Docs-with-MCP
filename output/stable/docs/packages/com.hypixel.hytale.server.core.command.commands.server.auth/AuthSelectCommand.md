---
title: "AuthSelectCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.commands.server.auth"
fqcn: "com.hypixel.hytale.server.core.command.commands.server.auth.AuthSelectCommand"
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
public class AuthSelectCommand extends CommandBase
```

Server command implementation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super("select", "server.commands.auth.select.desc")` |
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
| `` | `` | `sendProfileList(context, profiles)` |
| `` | `static void` | `sendProfileList(@Nonnull CommandContext context, @Nonnull SessionServiceClient.GameProfile[] profiles)` |
| `` | `` | `SelectProfileVariant()` |
| `` | `` | `super("server.commands.auth.select.variant.desc")` |
