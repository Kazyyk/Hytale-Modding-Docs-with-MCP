---
title: "SuggestionProvider"
kind: "interface"
package: "com.hypixel.hytale.server.core.command.system.suggestion"
fqcn: "com.hypixel.hytale.server.core.command.system.suggestion.SuggestionProvider"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
  - "suggestion"
---

**Package:** `com.hypixel.hytale.server.core.command.system.suggestion`

```java
@FunctionalInterface
public interface SuggestionProvider
```

Functional interface defining `suggest` that returns `void`.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `suggest` | `void` | `CommandSender var1, String var2, int var3, SuggestionResult var4` |
