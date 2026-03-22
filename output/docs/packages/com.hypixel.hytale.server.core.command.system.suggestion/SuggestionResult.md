---
title: "SuggestionResult"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.suggestion"
fqcn: "com.hypixel.hytale.server.core.command.system.suggestion.SuggestionResult"
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
public class SuggestionResult
```

Utility type in the `suggestion` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getSuggestions()` | `List<String>` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `suggest(String suggestion)` | `SuggestionResult` | Instance method. |
| `suggest(Function<DataType, String> toStringFunction, DataType suggestion)` | `SuggestionResult` | Instance method. |
| `suggest(Object objectToString)` | `SuggestionResult` | Instance method. |
