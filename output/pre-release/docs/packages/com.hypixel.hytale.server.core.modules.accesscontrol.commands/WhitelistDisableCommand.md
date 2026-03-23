---
title: "WhitelistDisableCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.accesscontrol.commands"
fqcn: "com.hypixel.hytale.server.core.modules.accesscontrol.commands.WhitelistDisableCommand"
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
public class WhitelistDisableCommand extends CommandBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `Message` | `MESSAGE_MODULES_WHITELIST_DISABLED` |
| `@Nonnull private static final` | `Message` | `MESSAGE_MODULES_WHITELIST_ALREADY_DISABLED` |
| `@Nonnull private final` | `HytaleWhitelistProvider` | `whitelistProvider` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WhitelistDisableCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `executeSync(@Nonnull CommandContext context)` |
