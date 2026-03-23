---
title: "ReplaceSwapCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.ReplaceCommand.ReplaceSwapCommand"
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
private static class ReplaceSwapCommand extends AbstractPlayerCommand
```

Subcommand of `replace` that performs substring-based swapping across block type names. For each block in the asset map, if the block name contains the `from` substring, it is replaced with `to` to find the target block type.
