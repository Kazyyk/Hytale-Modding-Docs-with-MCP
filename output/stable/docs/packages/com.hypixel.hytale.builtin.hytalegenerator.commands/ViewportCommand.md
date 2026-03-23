---
title: "ViewportCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.commands"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.commands.ViewportCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.commands`

```java
public class ViewportCommand extends AbstractPlayerCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `FlagArg` | `deleteFlag` |
| `private final` | `OptionalArg<Integer>` | `radiusArg` |
| `private final` | `AssetManager` | `assetManager` |
| `private` | `Runnable` | `activeTask` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)` |
