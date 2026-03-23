---
title: "TimerFragmentCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.commands"
fqcn: "com.hypixel.hytale.builtin.portals.commands.TimerFragmentCommand"
api_surface: false
extends: "PortalWorldCommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.commands`

```java
public class TimerFragmentCommand extends PortalWorldCommandBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<Integer>` | `remainingSecondsArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, PortalWorld portalWorld, Store<EntityStore> store)` |
