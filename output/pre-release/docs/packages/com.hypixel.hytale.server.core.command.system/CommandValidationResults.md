---
title: "CommandValidationResults"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.CommandValidationResults"
api_surface: false
extends: "com.hypixel.hytale.codec.validation.ValidationResults"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class CommandValidationResults
```

Extends `ValidationResults` to bridge codec validation into the command `ParseResult` system. Collects validation exceptions and fails the parse result if any are errors.
