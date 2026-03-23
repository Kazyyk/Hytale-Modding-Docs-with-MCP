---
title: "ReplaceFromToCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.ReplaceCommand.ReplaceFromToCommand"
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
private static class ReplaceFromToCommand extends AbstractPlayerCommand
```

Usage variant of `replace` that accepts explicit `from` (BlockMask) and `to` (BlockPattern) arguments. Delegates to `ReplaceCommand.executeBlockReplace()` with both arguments.
