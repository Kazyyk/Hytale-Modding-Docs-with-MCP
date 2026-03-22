---
title: "HubCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.creativehub.command"
fqcn: "com.hypixel.hytale.builtin.creativehub.command.HubCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "creativehub"
  - "command"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.creativehub.command`

```java
public class HubCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Message` | `MESSAGE_NOT_IN_HUB_WORLD` |
| `private static final` | `Message` | `MESSAGE_ALREADY_IN_HUB` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)` |
| `@Nullable private static` | `World` | `findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)` |
