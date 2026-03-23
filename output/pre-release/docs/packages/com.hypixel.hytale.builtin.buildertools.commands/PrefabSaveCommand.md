---
title: "PrefabSaveCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.PrefabCommand.PrefabSaveCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "buildertools"
  - "creative"
  - "command"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.commands`

```java
private static class PrefabSaveCommand extends AbstractPlayerCommand
```

Subcommand of `prefab save` that opens the `PrefabSavePage` UI for the player when a selection exists. Validates that the player has an active selection with bounds before opening the page.
