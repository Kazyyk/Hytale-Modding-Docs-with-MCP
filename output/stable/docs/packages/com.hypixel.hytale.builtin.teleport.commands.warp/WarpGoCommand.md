---
title: "WarpGoCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport.commands.warp"
fqcn: "com.hypixel.hytale.builtin.teleport.commands.warp.WarpGoCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "teleport"
  - "commands"
  - "warp"
---

**Package:** `com.hypixel.hytale.builtin.teleport.commands.warp`

```java
public class WarpGoCommand extends AbstractPlayerCommand
```

Console command handling WarpGo operations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `RequiredArg<String>` | `warpNameArg` | `this.withRequiredArg("warpName", "server.commands.warp.warpName.desc", ArgTypes.STRING)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `WarpGoCommand()` |
| `@Override protected` | `void` | `execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)` |
