---
title: "ReplaceRegexCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.commands"
fqcn: "com.hypixel.hytale.builtin.buildertools.commands.ReplaceCommand.ReplaceRegexCommand"
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
private static class ReplaceRegexCommand extends AbstractPlayerCommand
```

Subcommand of `replace` that matches block types by regex pattern and replaces them with the specified block pattern. Compiles the `from` argument as a Java regex and iterates all block types to find matches.
