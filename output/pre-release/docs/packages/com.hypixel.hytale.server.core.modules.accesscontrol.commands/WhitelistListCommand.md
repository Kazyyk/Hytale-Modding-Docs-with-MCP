---
title: "WhitelistListCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.commands"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.commands.WhitelistListCommand"
api_surface: false
extends: "CommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "accesscontrol"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.accesscontrol.commands`

```java
public class WhitelistListCommand extends CommandBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `HytaleWhitelistProvider` | `whitelistProvider` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WhitelistListCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
